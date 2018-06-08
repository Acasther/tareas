
package tarea1;

import java.util.Scanner;


public class Tarea1 {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       
       int ex = 1;
       
       while(ex > 0){
           System.out.print("Digite un numero para saber si es par o impar:");
           int number = scanner.nextInt();
           int ev = 0;
           int od = 0;
           if(number%2==0) {
               System.out.print(number + " es par" + " ");
               ev++;
           }
           if (number%2>0) {
               System.out.print("El numero es impar ");
               od++;
           }
            System.out.print("Digite 0 para terminar el programa o digite otro numero para continuar ");
            ex = scanner.nextInt();
            System.out.println("Hay " + ev + " numeros pares" + " " + " Hay " + od + " numeros impares");
        }
        
            
    }
    
}
