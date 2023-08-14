package herencia;

class Profesion {
    private Long sueldo;
    private Long bono;

    public Profesion() {
        sueldo = 2000000L;
        bono = 0L;
    }

    public Profesion(Long bono) {
        sueldo = 2000000L;
        this.bono = bono;
    }

    public Long getBono() {
        return bono;
    }

    public void setBono(Long bono) {
        this.bono = bono;
    }

    public Long calcularSueldo() {
        return sueldo + bono;
    }
}






