package calendar;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class CalculadoraDeDiasVividos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		while (true) {
			System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
			String dataNascimentoStr = scanner.nextLine();
			LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

			System.out.println("Você nasceu em " + dataNascimento.format(formatter) + ";");

			LocalDate dataAtual = LocalDate.now();
			long diasVividos = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

			System.out.println("Você já viveu " + diasVividos + " dias.");

			System.out.print("Deseja continuar? (s/n): ");
			String resposta = scanner.nextLine();
			if (!resposta.equalsIgnoreCase("s")) {
				break;
			}
		}

		scanner.close();
	}
}
