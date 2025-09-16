package main.java.factory;

public class LogisticaLibro {
    public static Libro crearLibro(String tipo, String titulo, String autor){
        if(tipo.equals("fisico")) {
            return new LibroFisico(titulo, autor);
        }else {
            return new LibroDigital(titulo, autor);
        }
    }
}
