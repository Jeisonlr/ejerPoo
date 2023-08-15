public class CuentAhorro extends CuentaBase {
    private double interes = 0.1;
    public CuentAhorro(double apertura, double montoActual, double cantidad) {
        super(apertura, montoActual, cantidad);
    }
    @Override
    public void apertura (double apertura){
        montoActual = getMontoActual()+ apertura;
        setMontoActual(montoActual);
    }
    public void invertir(double cantidad){
        montoActual = getMontoActual()+ cantidad;
        montoActual += getMontoActual()* interes;
        setMontoActual(montoActual);
    }
    @Override
    public double consutaSaldo() {
        return getMontoActual();
    }
}