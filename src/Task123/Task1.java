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
public class Task1 {
     public int wordCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                if ((s.charAt(i + 1) >= 33 && s.charAt(i + 1) <= 47) || (s.charAt(i + 1) >= 58 && s.charAt(i + 1) <= 64) || (s.charAt(i + 1) >= 91 && s.charAt(i + 1) <= 96) || (s.charAt(i + 1) >= 123 && s.charAt(i + 1) <= 126)) {
                    boolean flag = false;
                    int check = i + 1;
                    for (int j = check; s.charAt(j) != ' ' && j < s.length() - 1; j++) {
                        if (s.charAt(j) != ' ' || s.charAt(j + 1) >= 33 && s.charAt(j + 1) <= 47 || s.charAt(j + 1) >= 58 && s.charAt(j + 1) <= 64 || s.charAt(j + 1) >= 91 && s.charAt(j + 1) <= 96 || s.charAt(j + 1) >= 123 && s.charAt(j + 1) <= 126) {
                        } else {
                            flag = true;
                        }
                    }
                    if (flag == true) {
                        count++;
                        System.err.print("2 ");
                    }
                } else {
                    count++;
                    System.err.print("1 ");
                }
            }
        }
        return count + 1;
    }

    public int vowelCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
   public boolean isSubstring(String c, String sub) {
        int p = sub.length();
        boolean flag = false;
        for (int i = 0; i < c.length(); i++) {
            for (int j = 0; j < sub.length(); j++) {
                if (sub.charAt(0) == c.charAt(i))
                {
                    if (sub.charAt(1) == c.charAt(i + 1)) 
                    {
                        

                        if (p > 2)
                        {
                            if (sub.charAt(2) == c.charAt(i + 2)) 
                            {
                                if(sub.charAt(2) != c.charAt(i + 2))
                                {
                                    flag=false;
                                    break;
                                }else
                                if (p > 3)
                                {
                                    if (sub.charAt(3) == c.charAt(i + 3)) 
                                     {
                                         if(sub.charAt(3) != c.charAt(i + 3))
                                         {
                                              flag = false;
                                        break;
                                         }else
                                        flag = true;
                                        break;
                                     } 
                                }
                                 else {
                            flag = true;
                            break;
                                }
                            }
                        } else {
                            flag = true;
                            break;
                        }
                    }else
                    {
                        flag=false;
                    }

                    break;

                }
            }
        }
        return flag;

    }
public int puncCount(String c) {
        int pun = 0;

        int l = c.length();
        for (int i = 0; i < l; i++) {

            if (c.charAt(i) >= '!' && c.charAt(i) <= '/') {
                pun++;
            }

        }
        int words = pun;
        return words;

    }
}
