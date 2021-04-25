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
public class Task3 {

    public String ridMultipleBlank(String s) {
        String modifiedString = "";
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() || i != 0) {
                if (s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && s.charAt(i + 1) != ',' && s.charAt(i + 1) != '.' && s.charAt(i + 1) != '?' && s.charAt(i + 1) != '!' && s.charAt(i + 1) != ')' && s.charAt(i + 1) != '}' && s.charAt(i + 1) != ']' && s.charAt(i - 1) != '(' && s.charAt(i - 1) != '{' && s.charAt(i + 1) != '[' && s.charAt(i + 1) != ':')) {
                    modifiedString += s.charAt(i);
                }
            } else {
                if (s.charAt(i) != ' ') {
                    modifiedString += s.charAt(i);
                }
            }
        }
        return modifiedString;
    }

    public String removeInteger(String c) {

        String l = "";
        for (int i = 0; i < c.length(); i++) {
            if (!(c.charAt(i) >= '0' && c.charAt(i) <= '9')) {
                l += c.charAt(i);
            }
        }
        return l;
    }

    public String stringEncryption(String s) {
        String encryptedString = "";
        s = s.toUpperCase();
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i=i+2) {
                int a = s.charAt(i);
                a = a*100;
                int b = s.charAt(i+1);
                char c = (char) (a+b);
                encryptedString += c;
            }
        }else{
            for (int i = 0; i < s.length()-1; i=i+2) {
                int a = s.charAt(i);
                a = a*100;
                int b = s.charAt(i+1);
                char c = (char) (a+b);
                encryptedString += c;
            }
            int d = s.charAt(s.length()-1) * 100;
            char e = (char) d;
            encryptedString += e;
        }

        return encryptedString;
    }
    
    public String stringDecryption(String s) {
        String decryptedString = "";
            for (int i = 0; i < s.length(); i++) {
                int a = s.charAt(i);
                int b = a%100;
                a = a/100;
                char c = (char) (a);
                char d = (char) b;
                decryptedString += c;
                decryptedString +=d;
            }

        return decryptedString.toLowerCase();
    }
}
