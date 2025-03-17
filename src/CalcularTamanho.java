import java.util.Scanner;

public class CalcularTamanho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variaveis declaradas
        int numlados;
        double medlado, area = 0, semiperimetro, apotema;
        String nomePoligno = "";

        // Constantes para mensagens
        final String MSG_NAO_POLIGNO = "NÃO É UM POLÍGONO";
        final String MSG_NAO_IDENTIFICADO = "POLIGONO NÃO IDENTIFICADO";

        System.out.println("Digite o número de lados do polígono: ");
        numlados = scanner.nextInt();

        // validao do numero de lados(para nao precisar calcular nenhum dado inutil)
        if (numlados < 3) {
            System.out.println(MSG_NAO_POLIGNO);
        } else if (numlados > 5) {
            System.out.println(MSG_NAO_IDENTIFICADO);
        } else { // pedido da medida dos lados
            System.out.println("Digite a medida do lado (em cm): ");
            medlado = scanner.nextDouble();

        // determina o poligono e calcula a area
        switch (numlados) {
            case 3: // triangulo equilátero formula heron
                semiperimetro = (3 * medlado) / 2;
                area = Math.sqrt(semiperimetro * Math.pow(semiperimetro - medlado, 3));
                nomePoligno = "Triâgulo";
                break;

            case 4:
                area = Math.pow(medlado, 2);
                nomePoligno = "Quadrado";
                break;

            case 5:
                apotema = medlado / (2 * Math.tan(Math.PI / 5));
                area = (5 * medlado * apotema) / 2;
                nomePoligno = "Pentágono";
                break;
        }
        System.out.printf("%s - área: %.2f  cm²%n", nomePoligno,  area );

        }
    }
}
