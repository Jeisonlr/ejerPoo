package herencia.targetas;

public class Categorias {
    import java.time.LocalDate;

    class TarjetaCredito {
        private String emisor;
        private Long cupo;
        private String numeroTarjeta;
        private Integer cvv;
        private LocalDate fechaVencimiento;

        // Constructor vacío
        public TarjetaCredito() {
        }

        // Constructor con todos los argumentos
        public TarjetaCredito(String emisor, Long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
            this.emisor = emisor;
            this.cupo = cupo;
            this.numeroTarjeta = numeroTarjeta;
            this.cvv = cvv;
            this.fechaVencimiento = fechaVencimiento;
        }

        // Getters y setters para todos los atributos
        public String getEmisor() {
            return emisor;
        }

        public void setEmisor(String emisor) {
            this.emisor = emisor;
        }

        public Long getCupo() {
            return cupo;
        }

        public void setCupo(Long cupo) {
            this.cupo = cupo;
        }

        public String getNumeroTarjeta() {
            return numeroTarjeta;
        }

        public void setNumeroTarjeta(String numeroTarjeta) {
            this.numeroTarjeta = numeroTarjeta;
        }

        public Integer getCvv() {
            return cvv;
        }

        public void setCvv(Integer cvv) {
            this.cvv = cvv;
        }

        public LocalDate getFechaVencimiento() {
            return fechaVencimiento;
        }

        public void setFechaVencimiento(LocalDate fechaVencimiento) {
            this.fechaVencimiento = fechaVencimiento;
        }

        // Método para imprimir los detalles de la tarjeta
        public void imprimir() {
            System.out.println("Emisor: " + emisor);
            System.out.println("Cupo: " + cupo);
            System.out.println("Número de Tarjeta: " + numeroTarjeta);
            System.out.println("CVV: " + cvv);
            System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        }
    }

    // Clase para el tipo de tarjeta Clásica
    class Clasica extends TarjetaCredito {
        public Clasica() {
            super("Visa", 100000L, "1111222233334444", 123, LocalDate.of(2025, 12, 31));
        }
    }

    // Clase para el tipo de tarjeta Dorada
    class Dorada extends TarjetaCredito {
        public Dorada() {
            super("MasterCard", 300000L, "5555666677778888", 456, LocalDate.of(2024, 10, 31));
        }
    }





    public class Main {
        public static void main(String[] args) {
            Clasica clasica = new Clasica();
            Dorada dorada = new Dorada();
            Platinum platinum = new Platinum();
            Black black = new Black();

            System.out.println("Detalles de la tarjeta Clásica:");
            clasica.imprimir();

            System.out.println("\nDetalles de la tarjeta Dorada:");
            dorada.imprimir();

            System.out.println("\nDetalles de la tarjeta Platinum:");
            platinum.imprimir();

            System.out.println("\nDetalles de la tarjeta Black:");
            black.imprimir();
        }
    }

}
