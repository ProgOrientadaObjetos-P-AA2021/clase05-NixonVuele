/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Se crea un objeto de tipo Autor
        Autor aut = new Autor("José", "Alvear");

        // Se crea un objeto de tipo Publicación
        int anioPublicacion = 2000;
        
        Publicacion p = new Publicacion(aut, anioPublicacion);
        
        System.out.printf("Publicación:\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                p.obtenerAutor().obtenerNombre(),
                p.obtenerAutor().obtenerApellido(),
                p.obtenerAnioPublicacion());
        Publicacion libro2 = new Publicacion(new Autor("Luis", "Jácome"), 1980);
        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                libro2.obtenerAutor().obtenerNombre(),
                libro2.obtenerAutor().obtenerApellido(),
                libro2.obtenerAnioPublicacion());
        
        aut.establecerApellido("Elizalde");
        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                p.obtenerAutor().obtenerNombre(),
                p.obtenerAutor().obtenerApellido(),
                p.obtenerAnioPublicacion());


    }
}
