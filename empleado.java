

public class empleado {
    private String Nombre;
    private String Apellido;
    private String Cargo;
    private String Direccion;
    private int Edad;
    public empleado (String nombre, String apellido, String cargo, String direccion, int edad){
        Nombre =nombre;
        Apellido =apellido;
        Cargo =cargo;
        Direccion =direccion;
        Edad =edad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
}

