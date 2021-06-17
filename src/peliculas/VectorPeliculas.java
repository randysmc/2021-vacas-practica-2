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
    
    //ordenamiento de seleccion
    /*
    public void ordenarPorNombre(){

        System.out.println("Ordenamiento por insercion");
        for(int i=0; i<(siguienteCodigo-1); i++){
            int pos =i;
            Pelicula aux = peliculas[i];

            while(pos>0 && (peliculas[pos-1].getNombre().compareTo(peliculas[pos].getNombre())<0)){
                peliculas[pos] = peliculas[pos-1];
                pos--;
            }
            peliculas[pos] = aux;
        }
    }*/

    //ordenamiento por 
    public void ordenarPorNombre(){
        Pelicula menor; Pelicula tmp;
        int pos;

        for(int i=0; i<(siguienteCodigo-2); i++){
            menor = peliculas[i];
            pos = i;

            for(int j=i+1; j<(siguienteCodigo-1); j++){
                if(peliculas[j].getNombre().compareTo(menor.getNombre()) <0){
                    menor = peliculas[j];
                    pos =j;
                }
            }

            if(pos != i){
                tmp = peliculas[i];
                peliculas[i]=peliculas[pos];
                peliculas[pos] = tmp;

            }

        }
    }


    
}
