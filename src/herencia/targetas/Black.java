package herencia.targetas;

// Clase para el tipo de tarjeta Black
class Black extends Categorias.TarjetaCredito {
    public Black() {
        super("Visa", 1000000L, "1234123412345678", 999, LocalDate.of(2027, 8, 31));
    }
}

