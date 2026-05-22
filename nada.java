
class Carro {

    String marca;
    String modelo;
    String cor;
    int ano;
    int velocidade;

    void ligar() {
        System.out.println("Carro ligado");
    }

    void acelerar(int valor) {
        velocidade += valor;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    void frear(int valor) {
        velocidade -= valor;

        if (velocidade < 0) {
            velocidade = 0;
        }

        System.out.println("Freou para " + velocidade + " km/h");
    }

    void mostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.marca = "BMW";
        carro1.modelo = "M3";
        carro1.cor = "Azul";
        carro1.ano = 2022;

        carro1.ligar();
        carro1.acelerar(80);

        carro1.mostrarDados();

        System.out.println("-----");

        Carro carro2 = new Carro();

        carro2.marca = "Chevrolet";
        carro2.modelo = "Camaro";
        carro2.cor = "Amarelo";
        carro2.ano = 2021;

        carro2.ligar();
        carro2.acelerar(140);
        carro2.frear(30);

        carro2.mostrarDados();
    }
}