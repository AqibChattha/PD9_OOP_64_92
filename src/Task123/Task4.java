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

    public String ConvertLowerCase(String c) {
        String line = "";
        for (int i = 0; i < stringLength(c); i++) {
            if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z') {
                line += (char) (c.charAt(i) + 32);
            } else {
                line += (char) (c.charAt(i));
            }
        }
        return line;
    }

    public String ConvertUpperCase(String c) {
        String line = "";
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z') {
                line += (char) (c.charAt(i) - 32);
            } else {
                line += (char) (c.charAt(i));
            }
        }
        return line;
    }

    public boolean isEqual(String a, String b) {
        boolean flag = false;
        if (a.length() != b.length()) {
            flag = false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == a.charAt(i)) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }

    public boolean endWithSpecifiedCharacter(String c) {
        boolean flag = false;
        int l = c.length();
        for (int i = 0; i < l; i++) {
            if ((c.charAt(l - 1) >= '!' && c.charAt(l - 1) <= '/') || (c.charAt(l - 1) >= 58 && c.charAt(l - 1) <= 64 || (c.charAt(l - 1) >= 123 && c.charAt(l - 1) <= 126) || (c.charAt(l - 1) >= 208 && c.charAt(l - 1) <= 214) || (c.charAt(l - 1) >= 220 && c.charAt(l - 1) <= 221) || (c.charAt(l - 1) >= 246 && c.charAt(l - 1) <= 250))) {
                flag = true;
            }
        }
        return flag;
    }

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

}
