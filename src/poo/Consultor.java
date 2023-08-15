package poo;

public class Consultor extends Trabajador{
    private int horas;
    private double tarifa;

    public Consultor(String nombre,int horas, double tarifa) {
        super(nombre);
        this.horas = horas;
        this.tarifa = tarifa;
    }
    @Override
    public double calcularPago(){
        return (horas*tarifa);
    }

    @Override
    public String toString() {
        return "Consultor{" +
                "horas=" + horas +
                ", tarifa=" + tarifa +
                '}';
    }
}
