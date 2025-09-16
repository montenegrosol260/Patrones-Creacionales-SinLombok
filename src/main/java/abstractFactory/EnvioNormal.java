package main.java.abstractFactory;

public class EnvioNormal implements MetodoEnvio{
    @Override
    public void hacerEnvio() {
        System.out.println("hacemos envio normal");
    }
}
