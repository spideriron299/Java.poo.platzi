package src.platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static final String NOMBRE_PLATAFORMA = "Platzi Play";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        System.out.println( NOMBRE_PLATAFORMA + VERSION);

        String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
        String genero = ScannerUtils.capturarTexto("Genero del contenido");
        int duracion = ScannerUtils.capturarNumero("Duracoin del contenido");
        double calificacion = ScannerUtils.capturarDecimal("Calififcaion del contenido");

        Pelicula pelicula = new Pelicula(nombre, duracion, genero);

        System.out.println(pelicula.obtenerFichaTecnica());

        Usuario usuario = new Usuario("Diego", "diegobadillo@live.com");

        System.out.println(usuario.fechaRegistro);

        usuario.ver(pelicula);

    }
}