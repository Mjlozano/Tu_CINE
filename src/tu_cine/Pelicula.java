
package tu_cine;


public class Pelicula {
    private String nombre, clasificacion, genero, sinopsis, calidad, director, votacion;

    public Pelicula(String nombre, String clasificacion, String genero, String sinopsis, String calidad, String director, String votacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.calidad = calidad;
        this.director = director;
        this.votacion = votacion;
    }
    
    
    @Override
    public String toString(){
       return "Nombre: "+nombre+"\n"+"Genero: "+genero+"\n"+"Clasificacion: "+clasificacion+"\n"+"Sinopsis: "+sinopsis+"\n"+"Calidad: "+calidad+"\n"+"Director: "+director+"\n"+"Votacion: "+votacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getCalidad() {
        return calidad;
    }

    public String getDirector() {
        return director;
    }

    public String getVotacion() {
        return votacion;
    }
    
}
