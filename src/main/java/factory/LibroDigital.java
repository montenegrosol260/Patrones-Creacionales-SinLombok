package main.java.factory;

class LibroDigital implements Libro {
    private String titulo;
    private String autor;

    public LibroDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarTipo() {
        System.out.println("Tipo: libro Digital (formato ePub o PDF)");
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }
}
