package artur_cavadinha_7css;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testes {

    @Test
    void testeDistancia() {
        //recebe 2 vetores um 0,0 e outro 3,4. essa mizera tem que dar 5
    	assertEquals(5.0, calcula_desgraca.calcularDistancia(0,0,3,4));
    }
    
    @Test
    void testePontoMedioX() {
        //calculando ponto medio entre os pontos 2 e 6, tem que dar 4
    	assertEquals(4.0, calcula_desgraca.calcularPontoMedioX(2, 6));
    }
    
    @Test
    void testePontoMedioY() {
    	//mesma resenha de la
        assertEquals(6.0, calcula_desgraca.calcularPontoMedioY(4, 8));
    }
    
    @Test
    void testeModulo() {
    	//calula o valor abs do vetor à origem
        assertEquals(5.0, calcula_desgraca.calcularModulo(3, 4));
    }
    
    @Test
    void testeProdutoEscalar() {
    	//multiplica por escalar vetor 1,2 e 3,4
        assertEquals(11.0, calcula_desgraca.calcularProdutoEscalar(1,2,3,4));
    }
    
    @Test
    void testeDeterminante() {
    	//calcula det dos vetores usando a resenha de x1*y2 e y1*x2
        assertEquals(-2.0, calcula_desgraca.calcularDeterminante(1,2,3,4));
    }
    
    @Test
    void testeAreaTriangulo() {
    	//faz a area de 3 vetores
        assertEquals(6.0, calcula_desgraca.calcularAreaTriangulo(0,0,4,0,0,3));
    }
    
    @Test
    void testeCoeficienteAngular1() {
    	//calcula a inclinação recebendo 2 vetores
        assertEquals(2.0, calcula_desgraca.calcularCoeficienteAngular(1,1,3,5));
    }
}
