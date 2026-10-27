/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CalculadoraCompra;

import CalculadoraCompra.CalculadoraCompra;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraCompraTest {

    @Test
    public void testarCompraDeUmProduto() {
        CalculadoraCompra calc = new CalculadoraCompra();
        double resultado = calc.calcularTotal(10.0, 1);
        assertEquals(10.0, resultado, 0.001);
    }

    @Test
    public void testarCompraDeVariosProdutos() {
        CalculadoraCompra calc = new CalculadoraCompra();
        double resultado = calc.calcularTotal(15.0, 3);
        assertEquals(45.0, resultado, 0.001);
    }

    @Test
    public void testarCompraDeCincoProdutos() {
        CalculadoraCompra calc = new CalculadoraCompra();
        double resultado = calc.calcularTotal(8.0, 5);
        assertEquals(40.0, resultado, 0.001);
    }

    @Test
    public void testarCompraDeDezProdutos() {
        CalculadoraCompra calc = new CalculadoraCompra();
        double resultado = calc.calcularTotal(2.50, 10);
        assertEquals(25.0, resultado, 0.001);
    }
}
