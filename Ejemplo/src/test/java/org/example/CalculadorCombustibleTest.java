package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculadorCombustibleTest {
    private CalculadorCombustible calculadorCombustible;

    @BeforeEach
    void setUp() {
        calculadorCombustible = CalculadorCombustible.getInstance();
    }

    @Test
    void getInstance() {
        CalculadorCombustible resultado = CalculadorCombustible.getInstance();

        Assert.assertSame(calculadorCombustible, resultado);
    }

    @Test
    void calcularCombustible() {
        Avion avion = mock(Avion.class);
        final int distancia = 10;

        when(avion.volar(distancia)).thenReturn(10);

        int resultado = calculadorCombustible.calcularCombustible(avion, distancia);

        Assert.assertEquals(10, resultado);
    }
}