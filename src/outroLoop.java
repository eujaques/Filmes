import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Dê a sua avaliação ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliação  " + mediaAvaliacao/totalDeNotas);

    }
}
