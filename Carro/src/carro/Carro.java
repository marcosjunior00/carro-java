package carro;

public class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;
    
    // Métodos
    public void imprimeDetalhes() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
    }
}
