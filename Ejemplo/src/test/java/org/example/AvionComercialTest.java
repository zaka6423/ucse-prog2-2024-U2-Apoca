package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {
    public AvionComercial avionComercial = new AvionComercial(50, 10);

    @Test
    void volar() {
        int resultado = avionComercial.volar(10);

        Assert.assertEquals(100, resultado);
    }

    @Test
    public void testGetConsumoCombustible() {
        int resultado = avionComercial.getConsumoCombustible();

        Assert.assertEquals(10, resultado);
    }
}
