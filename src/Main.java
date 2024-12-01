public class Main {
    public static void main(String[] args) {
        Persona<String, Integer> persona = new Persona<>("Paula", 25);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        persona.setNombre("Maria");
        persona.setEdad(30);

        System.out.println(persona);
    }
}
