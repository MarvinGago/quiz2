/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg2;

/**
 *
 * @author CPUw1010
 */
public class Cancion {
    public int id;
    public String titulo;
    public String autor;
    private double duracion;
    private int anioCreacion;
    
    public Cancion(int id,String titulo,String autor,double duracion,int AnioCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioCreacion = AnioCreacion;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo =titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public double getDuracion(){
        return duracion;
    }
    public void setDuracion(double duracion){
        this.duracion = duracion;
    }
    public int getAnioCreacion(){
        int AnioCreacion = 0;
        return AnioCreacion;
    }
    public void setAnioCreacion(int AnioCreacion){
        this.anioCreacion =AnioCreacion;
    }
}
