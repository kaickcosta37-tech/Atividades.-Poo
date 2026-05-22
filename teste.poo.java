public class Main {

    public static void main(String[] args) {

        String modelo = "Ferrari";

        // ---------------------------------------------------------
        // ESCOPO DE MÉTODO
        // ---------------------------------------------------------

        String mensagem = "Detalhes do carro:";

        // ---------------------------------------------------------
        // ESCOPO DE BLOCO
        // ---------------------------------------------------------

        if (modelo != null) {

            boolean temModelo = true;

            System.out.println(mensagem + " Modelo " + modelo);

            System.out.println("Tem modelo? " + temModelo);
        }
    }
}