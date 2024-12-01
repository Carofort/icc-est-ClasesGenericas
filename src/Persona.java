public class Persona<N, E> {
    private N nombre;
    private E edad;

    public Persona(N nombre, E edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public N getNombre() {
        return nombre;
    }

    public void setNombre(N nombre) {
        this.nombre = nombre;
    }

    public E getEdad() {
        return edad;
    }

    public void setEdad(E edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre= " + nombre + ", edad= " + edad + '}';
    }
}
