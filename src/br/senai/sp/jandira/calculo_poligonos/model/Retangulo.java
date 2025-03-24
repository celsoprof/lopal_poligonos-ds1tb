package br.senai.sp.jandira.calculo_poligonos.model;

public class Retangulo {
    // Atributos
    private double base;
    private double altura;

    // Métodos Getters e Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos de cálculo
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularArea() {
        return base * altura;
    }

    // Método para exibir dados
    public void exibirDados() {
    	System.out.println("-------------------------------------");
    	System.out.println("               RETÂNGULO");
    	System.out.println("-------------------------------------");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
        System.out.println("-------------------------------------");
        System.out.println();
    }
}
