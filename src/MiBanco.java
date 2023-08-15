import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MiBanco {
    public static void main(String[] args) {

        double dinero;
        Scanner entrada = new Scanner(System.in);

        Debito debito = new Debito(0, 0, 0);
        CuentAhorro ahorro = new CuentAhorro(0,0,0);
        Credito credito = new Credito(0,0,0);

        System.out.println("            TU CREDITO");

        System.out.println("TU DEUDA ES : $"+ credito.consutaSaldo());
        System.out.println("Ingrse el monto para sunar interes");
        dinero = entrada.nextDouble();
        credito.sumaInteres(dinero);



        System.out.println("          CUENTA DE AHORROS");

        System.out.println("Ingrese el monto para la apertura de su Cuenta De Ahorros:");
        dinero = entrada.nextDouble();
        ahorro.apertura(dinero);
        System.out.println("Acabas de Ingresar:  $" + dinero + "  Tu nuevo Saldo es: $" + ahorro.consutaSaldo());

        System.out.println("Ingrese el monto a invertir");
         dinero = entrada.nextDouble();
         ahorro.invertir(dinero);
        System.out.println("Acabas de invertir $"+dinero+" Tu nuevo saldo es: $"+ ahorro.consutaSaldo());

        System.out.println("          CUENTA CORRIENTE");

            System.out.println("Ingrese el monto para la apertura de su cuenta Debito:");
            dinero = entrada.nextDouble();
            debito.apertura(dinero);

            System.out.println("Acabas de ingresar:  $" + dinero + "  Tu nuevo Saldo es: $" + debito.consutaSaldo());

        System.out.println("Ingrese el monto a retirar");
        dinero = entrada.nextDouble();
        debito.retirar(dinero);
        System.out.println("Acabas de retirar $"+dinero+" Tu nuevo saldo es: $"+ debito.consutaSaldo());
    }
    }

