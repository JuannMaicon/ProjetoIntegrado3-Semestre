package veiculo;

//*Juan Maicon Andrade Santos//

public class ClasseVeiculo {
	private String marca;
	private String modelo;
	private String anoDeFabricacao;
	private String cor;
	private String placa;
	private boolean ligado = false;
	private int velocidade = 0;
	private int marcha = 0;

	public ClasseVeiculo(String marca, String modelo, String anoDeFabricacao, String cor, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.cor = cor;
		this.placa = placa;
	}

	public void ligar() {
		if (ligado == true) {
			System.out.println("Veículo já está ligado");
		} else {
			ligado = true;
			System.out.println("Veículo ligado");
		}
	}

	public void desligar() {
		if (ligado == false) {
			System.out.println("Veículo ja desligado");
		} else if (ligado == true && velocidade == 0) {
			System.out.println("Veículo desligado");
		} else if (ligado == true && velocidade != 0) {
			System.out.println("Desacelere o veículo para desligá-lo");
		}
	}

	public void marcha() {
		if (velocidade == 0) {
			marcha = 0;
		} else if (velocidade > 0 && velocidade <= 20) {
			marcha = 1;
		} else if (velocidade > 20 && velocidade <= 40) {
			marcha = 2;
		} else if (velocidade > 40 && velocidade <= 60) {
			marcha = 3;
		} else if (velocidade > 60 && velocidade <= 80) {
			marcha = 4;
		} else if (velocidade > 80 && velocidade <= 120) {
			marcha = 5;
		}

	}

	public void acelerar(int aumentoVelocidade) {
		if (ligado == true) {
			velocidade += aumentoVelocidade;
			if (velocidade > 120) {
				velocidade = 120;
				System.out.println("Velocidade permitida até 120km/h");
			}
			marcha();
			System.out.println("Velocidade = " + velocidade + "km/h marcha = " + marcha);
		} else {
			System.out.println("Veículo desligado, ligue o veículo antes de acelerar");
		}
	}

	public void desacelerar(int diminuiVelocidade) {
		if (ligado == true) {
			velocidade -= diminuiVelocidade;
			if (velocidade < 0) {
				velocidade = 0;
			}
			marcha();
			System.out.println("Velocidade = " + velocidade + "km/h marcha = " + marcha);
		} else {
			System.out.println("Veículo desligado, ligue o veículo antes de desacelerar");
		}
	}

	public void parar() {
		if (ligado == true) {
			velocidade = 0;
			marcha();
			System.out.println("Veículo parado");
		}
	}

	public void info() {
		System.out.println("Marca: " + this.marca + " Modelo: " + this.modelo + " Ano de fabricação: "
				+ this.anoDeFabricacao + " Cor: " + this.cor + " Placa: " + this.placa);
		if (ligado == false) {
			System.out.println("O veículo está desligado");
		} else {
			System.out.println("O Veículo está ligado");
			if (velocidade == 0) {
				System.out.println("Velocidade = " + velocidade + "km/h marcha: " + "Neutro");
			} else {
				System.out.println("Velocidade = " + velocidade + "km/h marcha: " + marcha);
			}

		}
	}

}
