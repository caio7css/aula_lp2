import java.util.Scanner;

public class calcula_desgraca {
    static Scanner sc = new Scanner(System.in);

    // 1. Distância entre dois pontos
    public static void calcularDistancia() {
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distância = %.4f\n", distancia);
    }

    // 2. Ponto médio (dois pontos)
    public static void calcularPontoMedio() {
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        double pmX = (x1 + x2) / 2;
        double pmY = (y1 + y2) / 2;
        System.out.printf("Ponto médio = (%.2f, %.2f)\n", pmX, pmY);
    }


    public static void calcularModuloVetor() {
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();

        double modulo = Math.sqrt(x * x + y * y);
        System.out.printf("Módulo = %.4f\n", modulo);
    }


    public static void calcularProdutoEscalar() {
        System.out.print("Vetor A - x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Vetor B - x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        double produto = x1 * x2 + y1 * y2;
        System.out.printf("Produto escalar = %.4f\n", produto);
    }


    public static void verificarPerpendicularidade() {
        System.out.print("Vetor A - x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Vetor B - x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        double dot = x1 * x2 + y1 * y2;
        if (Math.abs(dot) < 1e-9)
            System.out.println("Os vetores são PERPENDICULARES.");
        else
            System.out.println("Os vetores NÃO são perpendiculares.");
    }


    public static void verificarParalelismo() {
        System.out.print("Vetor A - x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Vetor B - x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        double det = x1 * y2 - y1 * x2;
        if (Math.abs(det) < 1e-9)
            System.out.println("Os vetores são PARALELOS.");
        else
            System.out.println("Os vetores NÃO são paralelos.");
    }


    public static void somarVetores() {
        System.out.print("Vetor A - x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Vetor B - x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        double sx = x1 + x2;
        double sy = y1 + y2;
        System.out.printf("Soma = (%.2f, %.2f)\n", sx, sy);
    }


    public static void subtrairVetores() {
        System.out.print("Vetor A - x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Vetor B - x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        double dx = x1 - x2;
        double dy = y1 - y2;
        System.out.printf("Subtração = (%.2f, %.2f)\n", dx, dy);
    }

    public static void multiplicarVetorPorEscalar() {
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();
        System.out.print("Escalar (k): ");
        double k = sc.nextDouble();

        double mx = x * k;
        double my = y * k;
        System.out.printf("Resultado = (%.2f, %.2f)\n", mx, my);
    }


    public static void calcularAreaTriangulo() {
        System.out.print("Ponto A - x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Ponto B - x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Ponto C - x3: ");
        double x3 = sc.nextDouble();
        System.out.print("y3: ");
        double y3 = sc.nextDouble();

        double area = 0.5 * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
        System.out.printf("Área do triângulo = %.4f\n", area);
    }


    public static void calcularCoeficienteAngular() {
        System.out.print("Ponto 1 - x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Ponto 2 - x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        if (x1 == x2) {
            System.out.println("Coeficiente angular indefinido (reta vertical).");
        } else {
            double m = (y2 - y1) / (x2 - x1);
            System.out.printf("Coeficiente angular = %.4f\n", m);
        }
    }


    public static void verificarColinearidade() {
        System.out.print("Ponto A - x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Ponto B - x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Ponto C - x3: ");
        double x3 = sc.nextDouble();
        System.out.print("y3: ");
        double y3 = sc.nextDouble();

        double area = 0.5 * ((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));
        if (Math.abs(area) < 1e-9)
            System.out.println("Os pontos são COLINEARES.");
        else
            System.out.println("Os pontos NÃO são colineares.");
    }

    // Método extra para calcular determinante (exigido pelo diagrama, mas pode ser usado internamente)
    public static double calcularDeterminante(double x1, double y1, double x2, double y2) {
        return x1 * y2 - y1 * x2;
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
            System.out.println("7 - Somar dois vetores");
            System.out.println("8 - Subtrair dois vetores");
            System.out.println("9 - Multiplicar vetor por escalar");
            System.out.println("10 - Calcular area de um triangulo por tres pontos");
            System.out.println("11 - Calcular coeficiente angular de uma reta");
            System.out.println("12 - Verificar se tres pontos sao colineares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: calcularDistancia(); break;
                case 2: calcularPontoMedio(); break;
                case 3: calcularModuloVetor(); break;
                case 4: calcularProdutoEscalar(); break;
                case 5: verificarPerpendicularidade(); break;
                case 6: verificarParalelismo(); break;
                case 7: somarVetores(); break;
                case 8: subtrairVetores(); break;
                case 9: multiplicarVetorPorEscalar(); break;
                case 10: calcularAreaTriangulo(); break;
                case 11: calcularCoeficienteAngular(); break;
                case 12: verificarColinearidade(); break;
                case 0: System.out.println("Programa encerrado!"); break;
                default: System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}