package artur_cavadinha_7css;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Testess {

    @Test
    void testeDistancia() {
        // recebe 2 pontos (0,0) e (3,4), distância = 5
        assertEquals(5.0,Calcular.calcularDistancia(0, 0, 3, 4));
    }

    @Test
    void testePontoMedioX() {
        // ponto médio entre 2 e 6 = 4
        assertEquals(4.0,Calcular.calcularPontoMedioX(2, 6));
    }

    @Test
    void testePontoMedioY() {
        // ponto médio entre 4 e 8 = 6
        assertEquals(6.0,Calcular.calcularPontoMedioY(4, 8));
    }

    @Test
    void testeModulo() {
        // módulo do vetor (3,4) = 5
        assertEquals(5.0, Calcular.calcularModulo(3, 4));
    }

    @Test
    void testeProdutoEscalar() {
        // (1*3) + (2*4) = 11
        assertEquals(11.0, Calcular.calcularProdutoEscalar(1, 2, 3, 4));
    }

    @Test
    void testeDeterminante() {
        // (1*4) - (2*3) = -2
        assertEquals(-2.0,Calcular.calcularDeterminante(1, 2, 3, 4));
    }

    @Test
    void testeAreaTriangulo() {
        // área do triângulo = 6
        assertEquals(6.0,Calcular.calcularAreaTriangulo(0, 0, 4, 0, 0, 3));
    }

    @Test
    void testeCoeficienteAngular() {
        // inclinação da reta = 2
        assertEquals(2.0, Calcular.calcularCoeficienteAngular(1, 1, 3, 5));
    }

    @Test
    void testeCoeficienteAngularRetaVertical() {
        // x1 == x2 -> retorna NaN
        assertTrue(Double.isNaN(Calcular.calcularCoeficienteAngular(2, 1, 2, 5)));
    }

    @Test
    void testePerpendicularidadeVerdadeiro() {
        // produto escalar = 0
        assertEquals(0.0,Calcular.calcularProdutoEscalar(1, 0, 0, 1),1e-9);
    }

    @Test
    void testePerpendicularidadeFalso() {
        // produto escalar != 0
        assertNotEquals(0.0,Calcular.calcularProdutoEscalar(1, 2, 3, 4), 1e-9);
    }

    @Test
    void testeParalelismoVerdadeiro() {
        // determinante = 0 -> paralelos
        assertEquals(0.0,Calcular.calcularDeterminante(1, 2, 2, 4),1e-9);
    }

    @Test
    void testeParalelismoFalso() {
        // determinante dif de  0
        assertNotEquals(0.0, Calcular.calcularDeterminante(1, 2, 3, 4), 1e-9);
    }

    @Test
    void testeColinearidadeVerdadeiro() {
        // área = 0 -> colineares
        assertEquals(0.0,Calcular.calcularAreaTriangulo(0, 0, 1, 1, 2, 2),1e-9);
    }

    @Test
    void testeColinearidadeFalso() {
        // área dif de 0
        assertNotEquals(0.0,Calcular.calcularAreaTriangulo(0, 0, 1, 1, 1, 2),1e-9);
    }
}
