package main.java.factory;

class LibroFisico implements Libro {
    private String titulo;
    private String autor;

    public LibroFisico(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarTipo(){
        System.out.println("Tipo: libro físico");
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
}
