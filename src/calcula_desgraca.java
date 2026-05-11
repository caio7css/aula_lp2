package artur_cavadinha_7css;

import java.util.Scanner;

public class calcula_desgraca {
    static Scanner sc = new Scanner(System.in);

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double calcularPontoMedioX(double x1, double x2) {
        return (x1 + x2) / 2;
    }

    public static double calcularPontoMedioY(double y1, double y2) {
        return (y1 + y2) / 2;
    }

    public static double calcularModulo(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static double calcularProdutoEscalar(double x1, double y1, double x2, double y2) {
        return (x1 * x2) + (y1 * y2);
    }

    public static double calcularDeterminante(double x1, double y1, double x2, double y2) {
        return (x1 * y2) - (y1 * x2);
    }

    public static double calcularAreaTriangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }

    public static double calcularCoeficienteAngular(double x1, double y1, double x2, double y2) {
        if (x1 == x2) return Double.NaN;
        return (y2 - y1) / (x2 - x1);
    }

    public static void verificarPerpendicularidade() {
        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        if (Math.abs(calcularProdutoEscalar(x1, y1, x2, y2)) < 1e-9)
            System.out.println("Os vetores são perpendiculares.");
        else
            System.out.println("Os vetores não são perpendiculares.");
    }

    public static void verificarParalelismo() {
        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        if (Math.abs(calcularDeterminante(x1, y1, x2, y2)) < 1e-9)
            System.out.println("Os vetores são paralelos.");
        else
            System.out.println("Os vetores não são paralelos.");
    }

    public static void verificarColinearidade() {
        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        double x3 = sc.nextDouble(); double y3 = sc.nextDouble();
        if (calcularAreaTriangulo(x1, y1, x2, y2, x3, y3) == 0)
            System.out.println("Os pontos são colineares.");
        else
            System.out.println("Os pontos não são colineares.");
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== MENU - VETORES E GEOMETRIA ANALITICA =====");
            System.out.println("1 - Calcular distancia entre dois pontos");
            System.out.println("2 - Calcular ponto medio entre dois pontos");
            System.out.println("3 - Calcular modulo de um vetor");
            System.out.println("4 - Calcular produto escalar entre dois vetores");
            System.out.println("5 - Verificar se dois vetores sao perpendiculares");
            System.out.println("6 - Verificar se dois vetores sao paralelos");
            System.out.println("10 - Calcular area de um triangulo por tres pontos");
            System.out.println("11 - Calcular coeficiente angular de uma reta");
            System.out.println("12 - Verificar se tres pontos sao colineares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: System.out.println(calcularDistancia(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble())); break;
                case 2: 
                    double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
                    System.out.println(calcularPontoMedioX(x1, x2) + " , " + calcularPontoMedioY(y1, y2)); 
                    break;
                case 3: System.out.println(calcularModulo(sc.nextDouble(), sc.nextDouble())); break;
                case 4: System.out.println(calcularProdutoEscalar(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble())); break;
                case 5: verificarPerpendicularidade(); break;
                case 6: verificarParalelismo(); break;
                case 10: System.out.println(calcularAreaTriangulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble())); break;
                case 11: System.out.println(calcularCoeficienteAngular(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble())); break;
                case 12: verificarColinearidade(); break;
            }
        } while (opcao != 0);
    }
}
