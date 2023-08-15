public class CuentaBase {
    private double apertura;
    protected double montoActual = 0;
    protected double cantidad;

    public CuentaBase(double apertura, double montoActual, double cantidad) {
        this.apertura = apertura;
        this.montoActual = montoActual;
        this.cantidad = cantidad;
    }

    public double getApertura() {
        return apertura;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }

    public double getCantidad() {
        return cantidad;
    }
//METODOS
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void apertura (double apertura){

    }


    public double consutaSaldo(){
        return montoActual;
    };
}
