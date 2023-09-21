public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("12345", "Juan", "Perez", "Masculino", 30);
        Cliente cliente = new Cliente("Ciudad1", "Direccion1", "123456789", "Empresa1");
        Tiquete tiquete = new Tiquete();

        tiquete.LiquidaReserva("Ciudad A", 5, "Efectivo");
        tiquete.MostrarDatos();
    }
}
