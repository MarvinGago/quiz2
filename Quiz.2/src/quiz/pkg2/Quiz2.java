/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg2;

/**
 *
 * @author CPUw1010
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion cancion1 = new Cancion(1, "cancion 1", "Autor 1", 3.5, 2021);
        Cancion cancion2 = new Cancion(2, "cancion 2", "Autor 2", 4.2, 2022);
        
        System.out.println("cancion 1:");
        System.out.println("ID:" + cancion1.getId());
        System.out.println("");
        System.out.println( "Titulo: "+ cancion1.getTitulo());
        System.out.println("Autor: "+ cancion1.getAutor());
        System.out.println("Duracion: " + cancion1.getDuracion());
        System.out.println("Año creacion: "+ cancion1.getAnioCreacion());
        System.out.println("");
        //creacion de cancion 2
        System.out.println("cancion 2:");
        System.out.println("ID:" + cancion2.getId());
        System.out.println("");
        System.out.println( "Titulo: " + cancion2.getTitulo());
        System.out.println("Autor: " + cancion2.getAutor());
        System.out.println("Duracion: " + cancion2.getDuracion());
        System.out.println("Año de creacion: " + cancion2.getAnioCreacion());
        
        
        
    }
    
}
