/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author Wendrya
 */
public class Palindromo {

    public boolean ehPalindromo(String frase) {

        String fraseFiltrada = frase
                .toUpperCase().replace(" ", "").replace("-", "");

        for(int i = 0; i < fraseFiltrada.length(); i++) {
            if(fraseFiltrada.charAt(i) != 
                    fraseFiltrada.charAt(fraseFiltrada.length() -1 -i)) {
                return false;
            }
        }

        return true;
    }
}
