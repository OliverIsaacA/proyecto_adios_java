public class TestingPersona {
    
    public static void main(String[] args) {
        //Declaramos el objeto de clase Persona
        Persona persona;

        //Construcción del objeto
        persona = new Persona("Mariano", "Perez");
        persona.setNacionalidad("Mexicano");
        persona.setEstadoCivil("Soltero");
        persona.setDireccion("Prolongación Carranza No.14 A");
        persona.setEdad(18);
        persona.setTelefono(226172424);
        persona.setEstatura(1.69);
        persona.setPeso(72.5);
        persona.setGenero('H');
        System.out.println("Datos de la persona: " + persona.toString());
        
}
}
