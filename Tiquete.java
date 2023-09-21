public class Tiquete {
    private String nroTiquete;
    private String ciudad;
    private int diasHospedaje;
    private int costoPersona;
    private int costoComida;
    private double descuentos;
    private double total;
    private String formaPago;

    public Tiquete() {
        // Constructor vacío
    }

    public void LiquidaReserva(String ciudad, int personas, String formaPago) {
        this.nroTiquete = "TQ123";
        this.ciudad = ciudad;
        this.diasHospedaje = 5;
        this.costoPersona = 100000;
        this.costoComida = 9000;
        this.formaPago = formaPago;

        // Calcular el costo total antes de aplicar descuentos
        double costoTotal = personas * (diasHospedaje * costoPersona + diasHospedaje * costoComida);

        // Aplicar descuentos
        if (personas >= 1 && personas <= 10) {
            descuentos = costoTotal * 0.10;
        } else if (personas > 10) {
            descuentos = costoTotal * 0.15;
        }

        if (ciudad.equals("Ciudad A") || ciudad.equals("Ciudad B")) {
            descuentos += costoTotal * 0.02;
        } else if (ciudad.equals("Ciudad C") || ciudad.equals("Ciudad D")) {
            descuentos += costoTotal * 0.05;
        }

        if (formaPago.equals("Efectivo")) {
            descuentos += costoTotal * 0.04;
        } else if (formaPago.equals("Crédito")) {
            total = costoTotal + (costoTotal * 0.015);
        }

        total = costoTotal - descuentos;
    }

    public void MostrarDatos() {
        System.out.println("Número de Tiquete: " + nroTiquete);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Días de Hospedaje: " + diasHospedaje);
        System.out.println("Costo por Persona: " + costoPersona);
        System.out.println("Costo de Comida: " + costoComida);
        System.out.println("Descuentos: " + descuentos);
        System.out.println("Total a Pagar: " + total);
        System.out.println("Forma de Pago: " + formaPago);
    }
}

