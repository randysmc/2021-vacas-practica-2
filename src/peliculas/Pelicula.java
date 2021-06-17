package src.peliculas;

public class Pelicula{
    private int id;
    private String nombre;
    private String genero;
    private int anyo;


    public Pelicula(int id, String nombre, String genero, int anyo){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.anyo = anyo;

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;

    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getAnyo(){
        return anyo;
    }

    public void setAnyo(int anyo){
        this.anyo = anyo;
    }

    public String getInformacionP(){
        
        String resultado = "Id: "+id+" Nombre de la pelicula " + nombre+ " Genero: " +genero+ " Año: " + anyo;
        return resultado;
    }


}