package herencia;



public class SalarioProfesion {
    public static void main(String[] args) {
        Ingeniero ingeniero = new Ingeniero();
        Arquitecto arquitecto = new Arquitecto();
        Medico medico = new Medico();

        System.out.println("Sueldo Ingeniero: $" + ingeniero.calcularSueldo());
        System.out.println("Sueldo Arquitecto: $" + arquitecto.calcularSueldo());
        System.out.println("Sueldo Médico: $" + medico.calcularSueldo());

    }
}