package EjerSebas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes con notas y asistencia
        double[] notasEstudiante1 = { 85.0, 90.5, 78.3, 92.7 };
        double[] asistenciaEstudiante1 = { 0.9, 0.85, 0.75, 0.95 };
        Estudiante estudiante1 = new Estudiante("Juan", 20, "Masculino", "2023001", notasEstudiante1, asistenciaEstudiante1);

        double[] notasEstudiante2 = { 70.0, 88.5, 95.2, 87.4 };
        double[] asistenciaEstudiante2 = { 0.85, 0.80, 0.90, 0.88 };
        Estudiante estudiante2 = new Estudiante("Ana", 22, "Femenino", "2023002", notasEstudiante2, asistenciaEstudiante2);

        // Crear profesor con materias
        ArrayList<String> materiasProfesor = new ArrayList<>();
        materiasProfesor.add("Matemáticas");
        materiasProfesor.add("Física");
        Profesor profesor1 = new Profesor("María", 35, "Femenino", "Doctora", materiasProfesor);

        // Crear cursos presenciales y virtuales
        ArrayList<Estudiante> estudiantesCurso = new ArrayList<>();
        estudiantesCurso.add(estudiante1);
        estudiantesCurso.add(estudiante2);

        CursoPresencial cursoPresencial = new CursoPresencial("Matemáticas Avanzadas", profesor1, estudiantesCurso, "Lunes 9:00 AM");

        CursoVirtual cursoVirtual = new CursoVirtual("Física Moderna", profesor1, estudiantesCurso, "Plataforma Virtual");

        // Agregar cursos, profesores y estudiantes a la Universidad
        Universidad universidad = new Universidad();
        universidad.agregarCurso(cursoPresencial);
        universidad.agregarCurso(cursoVirtual);
        universidad.agregarProfesor(profesor1);
        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);

        // Calcular y mostrar el promedio de asistencia y participación
        double promedioAsistencia = cursoPresencial.calcularAsistenciaPromedio();
        double promedioParticipacion = cursoVirtual.calcularParticipacionPromedio();

        System.out.println("Promedio de asistencia: " + promedioAsistencia);
        System.out.println("Promedio de participación: " + promedioParticipacion);

        // Mostrar información completa de la universidad
        universidad.mostrarInformacionCompleta();
    }
}
