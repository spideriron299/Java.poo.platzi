package src.platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

public class Main {

    public static final String NOMBRE_PLATAFORMA = "Platzi Play";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println( NOMBRE_PLATAFORMA + VERSION);

        String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
        String genero = ScannerUtils.capturarTexto("Genero del contenido");
        int duracion = ScannerUtils.capturarNumero("Duracoin del contenido");
        double calificacion = ScannerUtils.capturarDecimal("Calififcaion del contenido");

        Pelicula pelicula = new Pelicula(nombre, duracion, genero);
        Pelicula pelicula2 = new Pelicula("Spiderman 2", 123, "Accion");

        plataforma.agregar(pelicula);
        plataforma.agregar(pelicula2);
        System.out.println("Numero de elementos en la plataforma: " + plataforma.getContenido().size());
        plataforma.eliminar(pelicula2);

        plataforma.mostrarTitulos();

        Usuario usuario = new Usuario("Diego", "diegobadillo@live.com");

        System.out.println(usuario.fechaRegistro);

        usuario.ver(pelicula);

    }
}