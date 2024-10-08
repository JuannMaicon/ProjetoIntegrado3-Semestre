package ado3;
//Juan Maicon Andrade Santos
public class Pessoa {

	private char sexo;
    private double altura;
    private double peso;

    public Pessoa(char sexo, double altura, double peso) {
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        if (sexo == 'F') {
            if (imc < 19) {
                return "Abaixo do peso";
            } else if (imc >= 19 && imc <= 23.9) {
                return "Normal";
            } else if (imc >= 24 && imc <= 28.9) {
                return "Obesidade leve";
            } else if (imc >= 29 && imc <= 38.9) {
                return "Obesidade moderada";
            } else {
                return "Obesidade mórbida";
            }
        } else if (sexo == 'M') {
            if (imc < 20) {
                return "Abaixo do peso";
            } else if (imc >= 20 && imc <= 24.9) {
                return "Normal";
            } else if (imc >= 25 && imc <= 29.9) {
                return "Obesidade leve";
            } else if (imc >= 30 && imc <= 39.9) {
                return "Obesidade moderada";
            } else {
                return "Obesidade mórbida";
            }
        } else {
            return "Sexo inválido";
        }
    }
}
