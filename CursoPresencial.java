package EjerSebas;

import java.util.ArrayList;

// Clase CursoPresencial
class CursoPresencial extends Curso {
    private String horario;

    public CursoPresencial(String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes, String horario) {
        super(nombreCurso, profesor, estudiantes);
        this.horario = horario;
    }

    public double calcularAsistenciaPromedio() {
        double totalAsistencia = 0;
        int totalEstudiantes = estudiantes.size();

        for (Estudiante estudiante : estudiantes) {
            double[] asistencia = estudiante.getAsistencia();
            double sumaAsistencia = 0;

            for (double porcentaje : asistencia) {
                sumaAsistencia += porcentaje;
            }

            totalAsistencia += sumaAsistencia / asistencia.length;
        }

        return totalAsistencia / totalEstudiantes;
    }
}