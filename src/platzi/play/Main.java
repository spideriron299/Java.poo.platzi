package src.platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Platzi Play");

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "El señor de los anillos";
        pelicula.fechaEstreno = LocalDate.of(2018, 10, 15);
        pelicula.genero = "Fantasia";
        pelicula.calificar(4.7);
        pelicula.duracion = 120;

        long duracionLong = pelicula.duracion;
        int calificacionInt = (int) pelicula.calificacion;
        long numerDePremios = Long.parseLong("25");

        System.out.println("Duracion long " + duracionLong);
        System.out.println("Calificacion Int " + calificacionInt);
        System.out.println("Numero de premios " + numerDePremios);

        Usuario usuario = new Usuario();
        usuario.nombre = "Juan";
        usuario.fechaRegistro = LocalDateTime.of(2026,4,1,18,45,14);

        System.out.println(usuario.fechaRegistro);

        usuario.ver(pelicula);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Cual es tu nombre?");
//        String nombre = scanner.nextLine();
//
//        System.out.println("Hola " + nombre + ", esto es Platzi Play");
//
//        System.out.println(nombre + " cuantos años tienes?");
//        int edad = scanner.nextInt();
//
//        System.out.println(nombre + " puede ver contenido + " + edad);
    }
}