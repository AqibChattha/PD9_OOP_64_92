/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task123;

/**
 *
 * @author qaziz
 */
public class Task2 {
    public String displayVertical(String s) {
        String modifiedString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                modifiedString += s.charAt(i) + "\n";
            }
        }
        return modifiedString;
    }
}
