package platzi.play;

import platzi.play.contenido.Pelicula;

public class MainStackHeap {
    public static void main(String[] args) {
        Pelicula reyLeon = new Pelicula("El Rey Leon", 135, "Animada");
        Pelicula harryPotter = new Pelicula("Harry Potter", 200, "Fantasia");

        reyLeon = harryPotter;

        reyLeon.titulo = "El hobit";

        System.out.println("reyLeon: " + reyLeon.titulo);
        System.out.println("harryPotter: " + harryPotter.titulo);
    }
}
