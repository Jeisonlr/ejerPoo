package EjerSebas;

import java.util.ArrayList;

// Clase abstracta Curso
abstract class Curso {
    protected String nombreCurso;
    protected Profesor profesor;
    protected ArrayList<Estudiante> estudiantes;

    public Curso(String nombreCurso, Profesor profesor, ArrayList<Estudiante> estudiantes) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }
}


