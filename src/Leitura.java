import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o seu filme");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de laçamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Dê a sua avaliação  ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
