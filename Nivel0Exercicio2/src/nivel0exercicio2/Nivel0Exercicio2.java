
package nivel0exercicio2;

import java.util.Scanner;


public class Nivel0Exercicio2 {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println ("Saiba a Área de um Terreno(Metros Quadrados):");
     
        System.out.println ("Infome a largura: (metros)");
        double largura = leia.nextDouble();
        
        System.out.println ("Infome o comprimento: (metros)");
        double comprimento = leia.nextDouble();
                
        double resultadoM = (largura * comprimento);
        System.out.println (resultadoM+" (metros quadrados)");

    }
    
}
