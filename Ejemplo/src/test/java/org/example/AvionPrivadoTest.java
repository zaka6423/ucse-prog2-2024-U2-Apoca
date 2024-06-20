package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AvionPrivadoTest {
    private final AvionPrivado AvionPrivado = new AvionPrivado(1000, 15);

    @BeforeEach
    void setUp() {
        int resultado = AvionPrivado.volar(20);

        Assert.assertEquals(800, resultado);
    }

    @Test
    void volar() {
        int resultado = AvionPrivado.getConsumoCombustible();

        Assert.assertEquals(15, resultado);
    }
}