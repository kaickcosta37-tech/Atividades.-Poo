class Aluno {
    // Atributos
    String  nome;
    double nota1, nota2;

    // Construtor
    Aluno(String n, double n1, double n2){
        nome = n;
        nota1 = n1;  nota2 = n2;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void apresentar() {
        System.out.println(nome + ": " + calcularMedia());
    }
}

class Main {
  public static void main(String[] args){

    // Criando objetos
    Aluno a1 = new Aluno("João", 8.0, 7.5);
    Aluno a2 = new Aluno("Maria", 9.5, 10.0);

    // Acessando atributos
    System.out.println(a1.nome);
    System.out.println(a2.nota1);

    // Chamando métodos
    a1.apresentar();
    a2.apresentar();

    double m = a1.calcularMedia();
    System.out.println("Média: " + m);
  }
}
