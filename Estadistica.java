package EjerSebas;

// Interfaz Estadisticas
interface Estadisticas {
    double calcularPromedio();
    double calcularMaximo();
    double calcularMinimo();
}

// Interfaz Gestionable
interface Gestionable {
    void inscribirEstudiante(Estudiante estudiante);
    void retirarEstudiante(Estudiante estudiante);
}







