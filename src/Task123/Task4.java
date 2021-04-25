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
public class Task4 {

    /**
     * method to find the length of the specified String.
     * @param s the string of which we want to know the length of.
     * @return length of the specified String.
     */
    public int stringLength(String s) {
        int i, c = 0;
        try {
            for (i = 0, c = 0; 0 <= i; i++, c++) {
                s.charAt(i);
            }
        } catch (Exception e) //Array index out of bounds and array index out of range are different exceptions
        {
            System.out.print("length is ");

        }
        return c;
    }

    /**
     * method to convert all the characters of the specified string into lower case.
     * @param c string to be converted.
     * @return lower cased string.
     */
    public String ConvertLowerCase(String c) {
        String line = "";
        for (int i = 0; i < stringLength(c); i++) {
            if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z') {
                line += c.charAt(i) + 32;
            } else {
                line += c.charAt(i);
            }
        }
        return line;
    }

    /**
     * method to convert all the characters of the specified string into upper case.
     * @param c string to be converted.
     * @return upper cased string.
     */
    public String ConvertUpperCase(String c) {
        String line = "";
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z') {
                line += c.charAt(i) - 32;
            } else {
                line += c.charAt(i);
            }
        }
        return line;
    }

    /**
     * method to check whether the two string are equal are not.
     * @param a input string.
     * @param b string to be compared.
     * @return true if strings are equal and false if not.
     */
    public boolean isEqual(String a, String b) {
        boolean flag = true;
        if (a.length() != b.length()) {
            flag = false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == a.charAt(i)) {
                    } else {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }

    /**
     * method to check whether or not the specified string ends with some particular characters.
     * @param c input string.
     * @return true if the string ends with the particular characters and false if not.
     */
    public boolean endWithSpecifiedCharacter(String c) {
        boolean flag = false;
        int l = c.length();
            if ((c.charAt(l - 1) >= '!' && c.charAt(l - 1) <= '/') || (c.charAt(l - 1) >= 58 && c.charAt(l - 1) <= 64 || (c.charAt(l - 1) >= 123 && c.charAt(l - 1) <= 126) || (c.charAt(l - 1) >= 208 && c.charAt(l - 1) <= 214) || (c.charAt(l - 1) >= 220 && c.charAt(l - 1) <= 221) || (c.charAt(l - 1) >= 246 && c.charAt(l - 1) <= 250))) {
                flag = true;
            }
        return flag;
    }

    /**
     * method to find the number of times a specified string is present in the input string.
     * @param inputString input string.
     * @param findString the string that is to be found.
     * @return number of instances the specified string is found.
     */
    public int numberOfInstances(String inputString, String findString) {
        int inctances = 0;
        boolean flag = true;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == findString.charAt(0)) {
                int count = 0;
                try {
                    for (int j = 0; (j < findString.length()); j++) {
                        if (inputString.charAt(i + count) == findString.charAt(j)) {
                        } else {
                            flag = false;
                            break;
                        }
                        count++;
                    }
                } catch (Exception e) {
                    flag = false;
                }
                if (flag == true) {
                    inctances++;
                } else {
                    flag = true;
                }
            }
        }
        return inctances;
    }
    
    /**
     * method to check whether the input string is integer and of specified length or not.
     * @param inputString input string.
     * @param length the specific length.
     * @return true if the code is valid and false if not.
     */
    public boolean isIntegerCodeOfLength(String inputString, int length){
        if (inputString.length()==length) {
            for (int i = 0; i < length; i++) {
                if (inputString.charAt(i)<'0' || inputString.charAt(i)>'9') {
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
    
    
}
