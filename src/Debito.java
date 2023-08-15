public class Debito extends CuentaBase{
    public Debito(double apertura,double montoActual,double cantidad){
        super(apertura,montoActual,cantidad);
    }
    @Override
    public void apertura (double apertura){
   montoActual = getMontoActual()+ apertura;
   setMontoActual(montoActual);
    }

    public void retirar(double cantidad){
        montoActual = getMontoActual()- cantidad;
        setMontoActual(montoActual);
    }
    @Override
    public double consutaSaldo() {
    return getMontoActual();
    }
}