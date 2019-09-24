/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba03;

import java.io.IOException;
import java.io.StringReader;


/**
 *
 * @author daniel
 */
public class Prueba03 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Usa la funcion de debajo
        try{
            ReadCharacters();
        }catch(IOException e){
            System.out.println("Error "+ e);
        }
    }
        
    /*
        Clase para leer 
    */   
    public static void ReadCharacters()throws IOException{
        //Crear StringBuilder 
        StringBuilder stringLeer = new StringBuilder();
        //Se le añade al final de cada salto la linea de texto que le introducimos
        stringLeer.append("Hola Mundo, como estas hoy? ");
        stringLeer.append("Comienzo de segunda linea");
        stringLeer.append("Comienzo tercera linea");

        
         //Creacion de String reader en el cual se le pasa el StringBuilder en ToString y luego lo imprime por pantalla
            StringReader reader = new StringReader(stringLeer.toString());
            
            /*
            Utilizar un try/catch para usar la función ready de StringReader.read que 
            debuelve un -1 si llega al final del array de caracteres y luego lo imprime
            por pantalla hasta el final del String        
            */            
            int k=0;  
            while((k=reader.read())!=-1){  
                System.out.print((char)k);  
            }  
            
        reader.close();
            
                
            
    }
    
    
           
       
}
    

