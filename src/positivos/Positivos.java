/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivos;
import java.util.Scanner;
/**
 *
 * @author JUAN CARLOS
 */
public class Positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita un numero: ");
        numero = entrada.nextInt();
        if(numero>0)
        {
            System.out.println("El numero es positivo");    
        }
        else
        {
            System.out.println("el numero es negativo");
        }
    }
    
}
