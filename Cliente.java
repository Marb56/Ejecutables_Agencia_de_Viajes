public class Cliente {
    private String ciudad;
    private String direccion;
    private String telefono;
    private String empresa;

    public Cliente() {
        // Constructor por defecto
    }

    public Cliente(String ciudad, String direccion, String telefono, String empresa) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    // Getters y setters
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
