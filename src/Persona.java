public class Persona {
    private String nombre;
    private String departamento;
    private String cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Persona (String nombre, String departamento, String cedula) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.cedula = cedula;


    }
}
