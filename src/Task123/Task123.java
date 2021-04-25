/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task123;

import java.util.Scanner;

/**
 *
 * @author humza
 */
public class Task123 {

    /*  static int wordCounter(String s) {
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

    static int vowelCounter(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }
   static boolean isSubstring(String c, String sub) {
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
static int puncCount(String c) {
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
    static String displayVertical(String s) {
        String modifiedString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                modifiedString += s.charAt(i) + "\n";
            }
        }
        return modifiedString;
    }

    static String ridMultipleBlank(String s) {
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

    static String removeInteger(String s) {
        String modifiedString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 47 || s.charAt(i) > 57) {
                modifiedString += s.charAt(i);
            }
        }
        return modifiedString;
    }
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String Of Task1 : \n");
        String scan = scanner.nextLine();
        String scan1, scan2, scan3, scan4 = "";
        System.out.print("Enter subString Of Task1 : \n");
        scan1 = scanner.next();
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        Task4 t4 = new Task4();
        System.out.println("Total numbers of words : " + t1.wordCounter(scan));
        System.out.println("Total numbers of Vowels : " + t1.vowelCounter(scan));
        System.out.println("Total numbers of Punctuation : " + t1.puncCount(scan));
        System.out.println(scan1 + "'' is the part of String ?  = " + t1.isSubstring(scan, scan1));
        System.out.println("Vertical String is  : \n" + t2.displayVertical(scan));
        System.out.println("Removed multiples blanks  : " + t3.ridMultipleBlank(scan));
        System.out.println("Removed integers  : " + t3.removeInteger(scan));
        
        
     
        /*
        int option;
        do {
            System.out.flush();
            System.out.println("_________String Manupulation Methods Of all Tasks_______\n\n");
            System.out.println("1- Open Task1 ");
            System.out.println("2- Open Task2 ");
            System.out.println("3- Open Task3 ");
            System.out.println("4- Open Task4 ");
            System.out.println("5- Exit ");
            System.out.print("Select option Number : ");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter String : \n");
                    
                    scan = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter subString : \n");
                    
                    scan1 = scanner.nextLine();
                    System.out.println("Total numbers of words : " + t1.wordCounter(scan));
                    // System.out.println("Total numbers of Vowels : "+t1.vowelCounter(scan));
                    //System.out.println("Total numbers of Punctuation : "+t1.puncCount(scan));
                    System.out.println(t1.vowelCounter(scan));

                    System.out.println(t1.puncCount(c));
                    System.out.println(scan1 + "'' id the part of String  : " + t1.isSubstring(scan, scan1));

                    break;
                case 2:
                    System.out.print("Enter String : ");
                    
                    scan2 = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Vertical String are  : \n" + t2.displayVertical(scan2));
                    break;
                case 3:
                    System.out.print("Enter String to rid of Multiple spaces : ");
                    
                    scan3 = scanner.nextLine();
                    System.out.println("The new String is  : " + t3.ridMultipleBlank(scan3));
                    System.out.println("The new String without integers is  : " + t3.removeInteger(scan3));
                case 4:
                    break;

                case 0:
                    System.exit(1);
                    break;

            }

        } while (option != 0);
         */
    }

}
