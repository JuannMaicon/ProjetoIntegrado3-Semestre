package aulaBD;

import java.sql.*;
import javax.swing.JOptionPane;

public class ExemploCadastro {
    public static void main(String[] args) {
        boolean continuarPrograma = true;

        while (continuarPrograma) {
            boolean continuarCadastro = true;

            try {
                ConectaMySQL conexao = new ConectaMySQL();
                Connection cn = conexao.openDB();

                while (continuarCadastro) {
                    try (PreparedStatement ps = cn.prepareStatement("INSERT INTO Alunos " +
                            "(alunosNome, alunosTelefone, alunosNota) VALUES (?, ?, ?)")) {

                        // Coleta os dados do usuário
                        ps.setString(1, JOptionPane.showInputDialog("Nome:", "Marcela Souza")); // nome
                        ps.setString(2, JOptionPane.showInputDialog("Telefone:", "(11)98585-5566")); // tel
                        ps.setDouble(3, Double.parseDouble(JOptionPane.showInputDialog("Nota:", 9.9))); // nota

                        // Executa o comando
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");

                        // Pergunta se deseja cadastrar outro aluno
                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?", "Confirmação", JOptionPane.YES_NO_OPTION);
                        if (resposta != JOptionPane.YES_OPTION) {
                            continuarCadastro = false;
                        }
                    } catch (SQLException e) {
                        System.out.println("Falha ao realizar a operação.");
                        e.printStackTrace();
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Formato de nota inválido. Por favor, insira um número.");
                    }
                }

                // Pergunta se deseja continuar no programa
                int continuarResposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outro cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (continuarResposta != JOptionPane.YES_OPTION) {
                    continuarPrograma = false;
                }

                conexao.closeDB(cn, null, null);
            } catch (SQLException e) {
                System.out.println("Falha ao abrir a conexão com o banco.");
                e.printStackTrace();
            }
        }

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
