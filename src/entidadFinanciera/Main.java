/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadFinanciera;

import com.sun.source.tree.TryTree;

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
	System.out.println("Quiero acabar esta pesadilla de grado");
	//Necesito ayuda
        objetoCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);

    }

    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception {
        
        try {
            c.ingresar(cantidad);
        } catch (Exception e)  {
        }

    }

    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception {
        
         try {
            c.retirar(cantidad);;
        } catch (Exception e)  {
        }
    }
}
