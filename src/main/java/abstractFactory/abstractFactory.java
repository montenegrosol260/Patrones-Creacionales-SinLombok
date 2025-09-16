package main.java.abstractFactory;

public interface abstractFactory {
    InterfazUI crearUI();   //deolverá algun tipo de interfaz
    MetodoEnvio crearEnvio();   //devolverá algún tipo de envio
}
