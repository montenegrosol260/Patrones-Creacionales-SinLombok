package main.java.builder;

public class Usuario {
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String DNI;

    //el metodo recibe un obj builder y copia todo los atributos desde builder a usuario
    //la clave está en que el constructor pega los valores que le pasa el builder, si no hay valor seteado
    //recibe un null, por eso permite tener atributos opcionales
    private Usuario(Builder builder){
        this.nombre = builder.nombre;
        this.email = builder.email;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
        this.DNI  = builder.DNI;
    }
    //Implementamos la clase de Usuario.Builder
    //almacena los datos temporalmente
    public static class Builder {
        private String nombre;
        private String email;
        private String direccion;
        private String telefono;
        private String DNI;

        //Métodos seters para los atributos
        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this; //debo eliminar esta fila si quiero que sea obligatorio
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder DNI(String DNI){
            this.DNI =  DNI;
            return this;
        }

        //Método build() para crear la instancia de usuario
        //a partir de los datos del builder para construir el Usuario
        public Usuario build(){
            return new Usuario(this);
        }
    }
}
