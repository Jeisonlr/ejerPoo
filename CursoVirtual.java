package EjerSebas;

import java.util.ArrayList;

// Clase CursoVirtual
class CursoVirtual extends Curso {
    private String plataforma;

    public CursoVirtual(String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes, String plataforma) {
        super(nombreCurso, profesor, estudiantes);
        this.plataforma = plataforma;
    }

    public double calcularParticipacionPromedio() {
        double totalParticipacion = 0;
        int totalEstudiantes = estudiantes.size();

        for (Estudiante estudiante : estudiantes) {
            double[] participacion = estudiante.getAsistencia();
            double sumaParticipacion = 0;

            for (double porcentaje : participacion) {
                sumaParticipacion += porcentaje;
            }

            totalParticipacion += sumaParticipacion / participacion.length;
        }

        return totalParticipacion / totalEstudiantes;
    }
}
