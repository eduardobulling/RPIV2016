/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miche
 */
public class ControlerTest {
    
    public ControlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dinheiroInserido method, of class Controler.
     */
    @Test
    public void testDinheiroInserido() {
        System.out.println("dinheiroInserido");
        Controler instance = new Controler();
        instance.dinheiroInserido();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of botaoPressionado method, of class Controler.
     */
    @Test
    public void testBotaoPressionado() {
        System.out.println("botaoPressionado");
        int botao = 0;
        Controler instance = new Controler();
        instance.botaoPressionado(botao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
