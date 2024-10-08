package ado3;
//Juan Maicon Andrade Santos
import java.util.Scanner;

public class TesteImc {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Recebendo dados da pessoa
	        System.out.print("Informe o sexo (M para masculino, F para feminino): ");
	        char sexo = scanner.next().toUpperCase().charAt(0);

	        System.out.print("Informe a altura (em metros): ");
	        double altura = scanner.nextDouble();

	        System.out.print("Informe o peso (em kg): ");
	        double peso = scanner.nextDouble();

	        // Criando o objeto Pessoa
	        Pessoa pessoa = new Pessoa(sexo, altura, peso);

	        // Calculando o IMC e classificando
	        double imc = pessoa.calcularIMC();
	        String classificacao = pessoa.classificarIMC();

	        // Exibindo o resultado
	        if (!classificacao.equals("Sexo inválido")) {
	            System.out.printf("IMC: %.2f\n", imc);
	        }
	        System.out.println("Classificação: " + classificacao);

	        scanner.close();
	    }
	}
