package veiculo;

public class TestaVeiculo {

//Juan Maicon Andrade Santos//

	public static void main(String[] args) {
		// Criando um objeto da classe Veiculo
		ClasseVeiculo meuCarro = new ClasseVeiculo("Toyota", "Corolla", "2024", "Preto", "ABC-1234");

		// Testando o método info() antes de ligar o veículo
		System.out.println("Informações iniciais do veículo:");
		meuCarro.info();
		System.out.println();

		// Ligando o veículo
		meuCarro.ligar();
		System.out.println();

		// Testando o método info() depois de ligar o veículo
		System.out.println("Informações do veículo após ligar:");
		meuCarro.info();
		System.out.println();

		// Acelerando o veículo
		meuCarro.acelerar(30);
		meuCarro.acelerar(50);
		meuCarro.acelerar(40);
		System.out.println();

		// Desacelerando o veículo
		meuCarro.desacelerar(30);
		meuCarro.desacelerar(20);
		meuCarro.desacelerar(100);
		System.out.println();

		// Parando o veículo
		meuCarro.parar();
		System.out.println();

		// Testando o método info() depois de parar o veículo
		System.out.println("Informações do veículo após parar:");
		meuCarro.info();
		System.out.println();

		// Desligando o veículo
		meuCarro.desligar();
		System.out.println();

		// Tentando desligar o veículo novamente
		meuCarro.desligar();
		System.out.println();

		// Tentando acelerar enquanto o veículo está desligado
		meuCarro.acelerar(20);
		System.out.println();

		// Tentando desacelerar enquanto o veículo está desligado
		meuCarro.desacelerar(20);
	}
}
