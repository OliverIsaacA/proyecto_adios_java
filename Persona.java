public class Persona {
//Atributos de Persona
    private String nombre, apellido, nacionalidad, EstadoCivil, direccion;
    private int edad, telefono;
    private double estatura, peso;
    private char genero;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;

    }
        
    public String getNacionalidad(){
        return this.nacionalidad;

    }

    public void setEstadoCivil(String EstadoCivil){
        this.EstadoCivil = EstadoCivil;

    }

    public String getEstadoCivil(){
        return this.EstadoCivil;

    }

    public void setDireccion(String direccion){
        this.direccion = direccion;

    }

    public String getDireccion(){
        return this.direccion;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + nombre + "\n Apellido: " + apellido + "\n Nacionalidad: " + nacionalidad
                + "\n Estado Civil: " + EstadoCivil + "\n Dirección: " + direccion + "\n Edad: " + edad + "\n Teléfono: "
                + telefono + "\n Estatura: " + estatura + "\n Peso: " + peso + "\n Género: " + genero;
    }
}
