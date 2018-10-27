/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos_diegocandela;

/**
 *
 * @author DCP
 */
public class Basicos_DiegoCandela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         numericos();  // Llamada al método
         
                  
    }
         /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {


       

        //Ejemplos de asignación de valores a las variables de tipos básicos

       //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;
      
        
        entero = 10;
        doble = 5.6;
        elMasPeque= 124;
        chiquitin= 32600;

        
        
        
        

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.print("Valor entero:  ");
        System.out.println(entero);
        System.out.print("Valor doble:  ");
        System.out.println(doble);
        System.out.print("Valor más pequeño:  ");
        System.out.println(elMasPeque);
        System.out.print("Valor pequeño:  ");
        System.out.println(chiquitin);

        
    }
}
