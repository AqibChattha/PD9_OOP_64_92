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
    
     public String removeInteger(String c)
            
    {
        
       String l="";
       for(int i=0;i<c.length();i++)
       {
           if(!(c.charAt(i)>='0' && c.charAt(i)<='9'))
           {
              l+=c.charAt(i);
           }
       }
       return l;
    }
     
     //encryption remaining method
}
