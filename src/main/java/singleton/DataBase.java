package main.java.singleton;

import main.java.factory.Libro;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private DataBase() {} //constructor privado y vacío
    private List<Libro> libros = new ArrayList<>(); //datos de la bd

    private static class Holder{ //definimos clase estática interna de database
                                //la utilizamos como un contenedor para la instancia unica
        private static final DataBase INSTANCE = new DataBase(); //Inicializac por JVM de tipo lazy
        //a través de final nos aseguramos que sea cte

    }
    //Obtener la instancia única
    public static DataBase getInstance() {//metodo estatico que instancia database
        return Holder.INSTANCE;  //Thread safe implícito
    }

    //Método para agregar libros
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    //Listar libros
    public void mostrarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros en la base de datos");
        } else {
            System.out.println("Lista de libros");
            for (Libro i : libros) {
                System.out.println(i.getTitulo() + ", " + i.getAutor());
            }
        }
    }
}
