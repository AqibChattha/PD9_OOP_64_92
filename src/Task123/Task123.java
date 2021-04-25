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

    /**
     * @param args the command line arguments
     */
    int a=4;
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 55;
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        Task4 t4 = new Task4();
        Scanner scanner = new Scanner(System.in);
        String option;
        String input_String;

        do {
            System.out.println("\n_________String Manupulation Methods Of all Tasks_______\n");
            System.out.println("1- Open Task1 ");
            System.out.println("2- Open Task2 ");
            System.out.println("3- Open Task3 ");
            System.out.println("4- Open Task4 ");
            System.out.println("0- Exit ");
            System.out.print("Select option Number : ");

            option = scanner.nextLine();
            switch (option) {
                case "1":
                    input_String = "";
                    System.out.println("Enter the string:");
                    input_String = scanner.nextLine();
                    System.out.println("Number of words: " + t1.wordCounter(input_String));
                    System.out.println("Number of vowels: " + t1.vowelCounter(input_String));
                    System.out.println("Number of punctuations: " + t1.puncCount(input_String));
                    if (t1.isSubstring(input_String, "the")) {
                        System.out.println("\"the\" is a part of this string.");
                    } else {
                        System.out.println("\"the\" is not a part of this string.");
                    }
                    break;
                case "2":
                    input_String = "";
                    System.out.println("Please enter a sentence:");
                    input_String = scanner.nextLine();
                    System.out.println("Your sentence printed vertically is: \n" + t2.displayVertical(input_String));
                    break;
                case "3":
                    input_String = "";
                    System.out.println("1- Remove Multiple Blank Spaces ");
                    System.out.println("2- Remove Integers ");
                    System.out.println("3- Encrypt ");
                    System.out.println("0- Go Back ");
                    option = scanner.nextLine();
                    if (option.equals("1") || option.equals("2") || option.equals("3")) {
                        System.out.println("Input String:");
                        input_String = scanner.nextLine();
                    }
                    switch (option) {
                        case "1":
                            System.out.println("\n"+t3.ridMultipleBlank(input_String));
                            break;
                        case "2":
                            System.out.println("\n"+t3.removeInteger(input_String));
                            break;
                        case "3":
                            String encryptedString = t3.stringEncryption(input_String);
                            System.out.println("\n"+encryptedString);
                            System.out.println("Enter D to decrypt this message else Go back.");
                            String decrypt = scanner.nextLine();
                            if (decrypt.equals("d")||decrypt.equals("D")) {
                                System.out.println("\n"+t3.stringDecryption(encryptedString));
                            }
                            break;
                        case "0":
                            
                            break;
                        default:
                            System.out.println("Invalid Input.");
                            break;
                    }
                    option = "3";
                    
                    break;
                case "4":
                    input_String = "";
                    System.out.println("1- Find String Length ");
                    System.out.println("2- Conver the String to Upper case Letters ");
                    System.out.println("3- Conver the String to Lower case Letters  ");
                    System.out.println("4- Compare the String to check thier equality ");
                    System.out.println("5- Check wether the String ends with a specified character ");   
                    System.out.println("6- Find the number of intances a string is present in input String ");    
                    System.out.println("7- Check wether the String is an integer code of input length ");                    
                    System.out.println("0- Go Back ");
                    option = scanner.nextLine();
                    if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("5") || option.equals("6") || option.equals("7")) {
                        System.out.println("Input String:");
                        input_String = scanner.nextLine();
                    }
                    switch (option) {
                        case "1":
                            System.out.println("The String length is: "+t4.stringLength(input_String));
                            break;
                        case "2":
                            System.out.println("Upper cased String: "+t4.ConvertUpperCase(input_String));
                            break;
                        case "3":
                            System.out.println("Lower cased String: "+t4.ConvertLowerCase(input_String));
                            break;
                        case "4":
                            System.out.println("Enter the Stiring You want to compare: ");
                            String second_String = scanner.nextLine();
                            if (t4.isEqual(input_String, second_String)) {
                                System.out.println("The Strings are equal.");
                            }else{
                                System.out.println("The Strings are not equal.");
                            }                            
                            break;
                        case "5":
                            if (t4.endWithSpecifiedCharacter(input_String)) {
                                System.out.println("The String ends with a specified character.");
                            }else{
                                System.out.println("The String does not end with a specified character.");
                            }
                            break;
                        case "6":
                            System.out.println("Enter the String you want to find the number of:");
                            String findString = scanner.nextLine();
                            System.out.println("Number of inctances: "+t4.numberOfInstances(input_String, findString));
                            break;
                        case "7":
                            System.out.println("Enter the length of the code: ");
                            int length = scanner.nextInt();
                            if (t4.isIntegerCodeOfLength(input_String, length)) {
                                System.out.println("It is a valid Code.");
                            }else{
                                System.out.println("It is not a valid Code.");
                            }
                            break;
                        case "0":
                            
                            break;
                        default:
                            System.out.println("Invalid Input.");
                            break;
                    }
                    option = "4";

                    break;

                case "0":
                    System.out.println("Thank You for using the System.");
                    System.out.println(option);
                    break;
                default:
                    System.out.println("Invalid Input.");
                    break;

            }

        } while (!option.equals("0"));

    }

}
