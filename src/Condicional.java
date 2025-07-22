public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2010;
        boolean inclusoNoPlano = true;
        double notaDoFilme  = 10;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("É filme novo!");
        } else {
            System.out.println("Você já está velha ein!");
        }

        if (inclusoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado.");
        } else {
            System.out.println("Tem que alugar.");
        }
    }
}
