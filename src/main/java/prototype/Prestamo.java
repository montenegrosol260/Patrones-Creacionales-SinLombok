package main.java.prototype;

import main.java.builder.Usuario;
import main.java.factory.Libro;

public class Prestamo implements Cloneable {
    private String fechaInicio;
    private String fechaFin;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(String fechaInicio, String fechaFin, Libro libro, Usuario usuario) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.libro = libro;
        this.usuario = usuario;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Prestamo clone(){
        try{
            return (Prestamo) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
