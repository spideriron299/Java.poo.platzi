package src.platzi.play.contenido;

public class Pelicula {
    public String titulo;
    public String descripcion;
    public int duracion;
    public String genero;
    public int anioEstreno;
    public double calificacion;
    public boolean disponible;

    public void reporducir() {
        System.out.println("Reproduciendo " + titulo );
    }

    public String obtenerFichaTecnica() {
        return titulo + " (" + anioEstreno + ")\n" + "Genero: "+ genero + "\nCalificacion: " + calificacion + "/5\n";
    }

    public void calificar( double calificacion){
        if (calificacion >= 0 && calificacion <= 5) {
            this.calificacion = calificacion;
        }
    }

    public boolean esPopular() {
        return calificacion >= 4;
    }
}
