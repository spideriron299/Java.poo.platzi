package src.platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

public class Main {

    public static final String NOMBRE_PLATAFORMA = "Platzi Play";
    public static final String VERSION = "1.0.0";

    public static final int AGREGAR = 1;
    public static final int MOSTRAR_TODO = 2;
    public static final int BUSCAR_POR_TITULO = 3;
    public static final int ELIMINAR = 4;
    public static final int SALIR = 5;


    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println( NOMBRE_PLATAFORMA + VERSION);

        while (true) {
            int opcionElegida = ScannerUtils.capturarNumero("""
                    Ingrese algun de las siguientes opciones:
                    1. Agregar Contenido
                    2. Mostrar todo
                    3. Buscar por titulo
                    4. Eliminar
                    5. Salir
                    """);

            System.out.println("Opcion elegida: " + opcionElegida);

            switch (opcionElegida){
                case AGREGAR -> {
                    String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
                    String genero = ScannerUtils.capturarTexto("Genero del contenido");
                    int duracion = ScannerUtils.capturarNumero("Duracoin del contenido");
                    double calificacion = ScannerUtils.capturarDecimal("Calififcaion del contenido");

                    plataforma.agregar(new Pelicula(nombre, duracion, genero,calificacion));

                }
                case MOSTRAR_TODO -> plataforma.mostrarTitulos();
                case BUSCAR_POR_TITULO -> {

                }
                case ELIMINAR -> {

                }
                case SALIR -> System.exit(0);
            }
        }


//        Pelicula pelicula2 = new Pelicula("Spiderman 2", 123, "Accion");
//
//        plataforma.agregar(pelicula);
//        plataforma.agregar(pelicula2);
//        System.out.println("Numero de elementos en la plataforma: " + plataforma.getContenido().size());
//        plataforma.eliminar(pelicula2);
//
//        plataforma.mostrarTitulos();
//
//        Usuario usuario = new Usuario("Diego", "diegobadillo@live.com");
//
//        System.out.println(usuario.fechaRegistro);
//
//        usuario.ver(pelicula);

    }
}