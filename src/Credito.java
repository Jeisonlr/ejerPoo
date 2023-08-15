public class Credito extends CuentaBase {
    private double interes = 0.05;

    public Credito(double apertura, double montoActual, double cantidad) {
        super(apertura, montoActual, cantidad);
    }

    public void sumaInteres(double cantidad) {
        montoActual = getMontoActual() - cantidad;
        montoActual += getApertura() * interes;
        setMontoActual(montoActual);

    }
        @Override
        public double consutaSaldo () {
        double deuda = -2000;
        montoActual = getMontoActual()+ deuda;
            return getMontoActual();
        }
    }
