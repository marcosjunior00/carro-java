package carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        c1.marca = "Honda";
        c1.modelo = "Civic";
        c1.ano = 2022;
        
        System.out.println("----------");
        c1.imprimeDetalhes();
        System.out.println("----------");
    }
}
