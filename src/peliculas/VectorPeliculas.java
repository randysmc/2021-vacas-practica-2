package src.peliculas;

import src.tienda.*;


public class VectorPeliculas {
    private Pelicula[]peliculas = new Pelicula[50];
    private int siguienteCodigo;

    public VectorPeliculas(){
        siguienteCodigo=1;

    }
    /**Metodo que recibe como parametros nombre, genero y anyo 
     * para guardar una nueva pelicula
     */
    public void agregarPelicula(String nombre, String genero, int anyo){

    if(siguienteCodigo >50){
        System.out.println("Se alcanzo el maximo de peliculas a ingresar");
    }else{
        peliculas[siguienteCodigo -1] = new Pelicula(siguienteCodigo, nombre, genero, anyo);
    }
    siguienteCodigo++;
    }
    /**Sobrecarga de constructor, aqui pedimos los  datos, llamamos al otro constructor
     * y le mandamos los parametros guardados
     */

    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        String genero = IngresoDatos.getTexto("Ingrese el genero");
        int anyo = IngresoDatos.getEntero("Ingrese el anyo ", false);
        agregarPelicula(nombre, genero, anyo);

    }

    public void mostrarPeliculas(){
        System.out.println("\n\nLas peliculas disponibles en memorabilia");
        for (int i = 0; i<(siguienteCodigo-1);i++){
            
            System.out.println("-"+i+") "+peliculas[i].getInformacionP());
        }

    }
    
}
