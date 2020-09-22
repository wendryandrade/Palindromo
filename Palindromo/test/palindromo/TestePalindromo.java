/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wendrya
 */
public class TestePalindromo {
    
    Palindromo palindromo = new Palindromo();
    
    public TestePalindromo() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestePalindromo() {
        assertTrue(palindromo.ehPalindromo("Ana"));
        assertTrue(palindromo.ehPalindromo("Ovo"));
        assertTrue(palindromo.ehPalindromo("Luz azul"));
        assertTrue(palindromo.ehPalindromo("Arara"));
        assertTrue(palindromo.ehPalindromo("Ame o poema"));
        assertFalse(palindromo.ehPalindromo("Wendrya"));
        
    }
}
