package main.java;  // Asegúrate de que coincida con el paquete

import main.java.abstractFactory.*;
import main.java.builder.Usuario;
import main.java.factory.*;
import main.java.prototype.Prestamo;
import main.java.singleton.DataBase;

public class Main {
    public static void main(String[] args) {
        //Obtener la instancia por 1ra vez
        DataBase db1 = DataBase.getInstance();
        //Creamos un libro fisico
        Libro libro1 = LogisticaLibro.crearLibro("fisico","Historia Universal de la Infamia", "J.L.Borges");
        libro1.mostrarTipo();
        System.out.println("Título: "+ libro1.getTitulo()+ " del autor "+libro1.getAutor());
        //lo agregamos en la base de datos
        db1.agregarLibro(libro1);
        Libro libro2 = LogisticaLibro.crearLibro("digital","El informe de Brodie", "J.L.Borges");
        db1.agregarLibro(libro2);
        libro2.mostrarTipo();
        System.out.println("Título:  "+ libro2.getTitulo()+ " del autor "+libro2.getAutor());
        //Intento obtener una sda instancia
        DataBase db2 = DataBase.getInstance();
        db2.agregarLibro(LogisticaLibro.crearLibro("fisico","1984", "George Orwell"));
        db2.mostrarLibros();
        //probramos que es la misma instancia
        System.out.println("¿Son la misma instancia? " + (db1 == db2));

        //declaramos una variable de tipo abstractFactory
        abstractFactory factory;
        //creamos fabrica concreta que implementa factory
        factory = new AdminFactory();
       //instanciamos productos concretos de la fabrica elegida
        InterfazUI ui = factory.crearUI();
        MetodoEnvio envio = factory.crearEnvio();
        //llamamos los metodos
        ui.mostrarPantalla();
        envio.hacerEnvio();

        //Utilizamos builder()
        Usuario user = new Usuario.Builder()
                .nombre("Sol")
                .email("sol@mail.com")
                .direccion("Calle Falsa 123")
                .build();

        Prestamo original = new Prestamo("12/03/2025","12/08/2025", libro1, user);
        Prestamo copia = original.clone();
        Prestamo copia2 = original.clone();

        copia.setFechaInicio("10/02/2024");
        copia.setFechaFin("10/04/2024");

        copia2.setFechaFin("15/06/2025");

        System.out.println("¿Son la misma instancia? " + (original == copia && copia == copia2));


    }
}