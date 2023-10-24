package com.example.parcial;

import org.junit.Test;
import static org.junit.Assert.*;
public class ContadorTest {

    @Test
    public void testIncrementar() {
        Contador contador = new Contador();
        contador.incrementar();
        assertEquals(1, contador.getNum());
    }

    @Test
    public void testDisminuir() {
        Contador contador = new Contador();
        contador.disminuir();
        assertEquals(-1, contador.getNum());
    }
}
