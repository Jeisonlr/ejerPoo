package poo;

import javax.xml.crypto.Data;

public class Trabajador {
    private String nombre;
    private String puesto;
    private String direccion;
    private String telefono;
    private Data fechaNacimiento;
    private Data fechaContrato;

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public  void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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

    public Data getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Data fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Data getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Data fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    //metodo
    public double calcularPago(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaContrato=" + fechaContrato +
                '}';
    }
}
