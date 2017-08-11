package lab4_ricardoromero_jeancarlosoto;

public class Jugador {

    String nombre;
    String usuario;
    String nacimiento;
    String sexo;
    int edad;

    public Jugador() {
    }

    public Jugador(String nombre, String usuario, String nacimiento, String sexo, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + nombre + ", usuario=" + usuario + ", lugar de nacimiento=" + nacimiento + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
   
}
