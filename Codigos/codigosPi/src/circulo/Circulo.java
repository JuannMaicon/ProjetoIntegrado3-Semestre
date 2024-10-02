package circulo;

public class Circulo {
	public int raio;
	   // Método para alterar o valor do raio
    public void setRaio(double raio) {
        this.raio =(int)  raio;
    }

    // Método para obter o valor do raio
    public double getRaio() {
        return this.raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    // Método para calcular o perímetro do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }
}




