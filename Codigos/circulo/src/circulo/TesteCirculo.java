package circulo;

public class TesteCirculo {

	public static void main(String[] args) {
		// Crie um objeto da classe Circulo
		Circulo circulo = new Circulo();

		// Altere o valor do raio para 10
		circulo.setRaio(10);

		// Obtenha o valor do raio
		double raio = circulo.getRaio();
		System.out.println("Raio: " + raio);

		// Calcule a área e o perímetro do círculo
		double area = circulo.calcularArea();
		double perimetro = circulo.calcularPerimetro();

		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimetro);
	}
}
