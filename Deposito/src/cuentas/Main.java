package cuentas;
/**
 * 
 * @author Lucas LMEL
 * APARATADO 1
 * Las clases deber�n formar parte del paquete cuentas.
 *
 */
public class Main {

    public static void main(String[] args) {
    	/**
    	 * 
    	 * APARATADO 3
    	 * Introducir el m�todo operativa_cuenta, 
    	 * que englobe las sentencias de la clase Main que operan con el objeto cuenta1.
    	 *
    	 */
        operativa_cuenta(0);
    }

	private static void operativa_cuenta(float cantidad) {
    	/**
    	 * 
    	 * APARATADO 2
    	 * Cambiar el nombre de la variable "miCuenta" por "cuenta1".
    	 * 
    	 * APARATADO 5
    	 * A�adir un nuevo par�metro al m�todo operativa_cuenta, 
    	 * de nombre cantidad y de tipo float.
    	 */
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
