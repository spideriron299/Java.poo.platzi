package src.platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Platzi Play");

        String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
        String genero = ScannerUtils.capturarTexto("Genero del contenido");
        int duracion = ScannerUtils.capturarNumero("Duracoin del contenido");
        double calificacion = ScannerUtils.capturarDecimal("Calififcaion del contenido");

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = nombre;
        pelicula.fechaEstreno = LocalDate.of(2018, 10, 15);
        pelicula.genero = genero;
        pelicula.calificar(calificacion);
        pelicula.duracion = duracion;

        System.out.println(pelicula.obtenerFichaTecnica());

        Usuario usuario = new Usuario();
        usuario.nombre = "Juan";
        usuario.fechaRegistro = LocalDateTime.of(2026,4,1,18,45,14);

        System.out.println(usuario.fechaRegistro);

        usuario.ver(pelicula);

    }
}