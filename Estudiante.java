package EjerSebas;

// Clase Estudiante
class Estudiante extends Persona implements Estadisticas {
    protected String carnet;
    protected double[] notas;
    protected double[] asistencia;

    public Estudiante(String nombre, int edad, String genero, String carnet, double[] notas, double[] asistencia) {
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = notas;
        this.asistencia = asistencia;
    }

    @Override
    public double calcularPromedio() {
        double sum = 0;
        for (double nota : notas) {
            sum += nota;
        }
        return sum / notas.length;
    }

    @Override
    public double calcularMaximo() {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    @Override
    public double calcularMinimo() {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }

    public double[] getAsistencia() {
        return asistencia;
    }
}

