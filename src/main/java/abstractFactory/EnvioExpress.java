package main.java.abstractFactory;

public class EnvioExpress implements MetodoEnvio{
    @Override
    public void hacerEnvio() {
        System.out.println("hacemos envio express");
    }
}
