package EjerSebas;

import java.util.ArrayList;

class Universidad {
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarInformacionCompleta() {
        System.out.println("Cursos en la universidad:");
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.nombreCurso);
            System.out.println("Profesor: " + curso.profesor.nombre);
            System.out.println("Estudiantes:");

            for (Estudiante estudiante : curso.estudiantes) {
                System.out.println("  - " + estudiante.nombre);
            }
        }

        System.out.println("Profesores en la universidad:");
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.nombre);
            System.out.println("Materias que enseña:");

            for (String materia : profesor.materias) {
                System.out.println("  - " + materia);
            }
        }

        System.out.println("Estudiantes en la universidad:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Estudiante: " + estudiante.nombre);
            System.out.println("Carnet: " + estudiante.carnet);
            System.out.println("Notas:");

            for (double nota : estudiante.notas) {
                System.out.println("  - " + nota);
            }
        }
    }
}
