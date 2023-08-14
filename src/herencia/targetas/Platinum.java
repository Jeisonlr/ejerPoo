package herencia.targetas;

// Clase para el tipo de tarjeta Platinum
class Platinum extends Categorias.TarjetaCredito {
    public Platinum() {
        super("American Express", 500000L, "9999000011112222", 789, LocalDate.of(2026, 6, 30));
    }
}
}
