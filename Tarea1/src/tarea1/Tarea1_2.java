
package tarea1;

import java.util.Scanner;


public class Tarea1_2 {

    
    public static void main(String[] args) {
        Scanner em = new Scanner(System.in);
        
        System.out.println("Escriba la palabra para saber si es palindromo: ");
        String str = em.nextLine();
        
        int cont = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                cont = 0;break;
            }
         }
        System.out.println( cont==1 ? "es palindromo" : "no es palindromo");
    }
    
}
