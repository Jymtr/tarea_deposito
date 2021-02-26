package cuentas;
/**
 * 
 * @author Juan Jesús Tenreiro Rodríguez
 * @version 1.1
 * @since 1.0
 * @see Main.java
 */
public class CCuenta {

      private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    /**
     * 
     * @param nom the nom to set
     * @param cue the cue to set
     * @param sal the sal to set
     * @param tipo the tipo to set
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * @see estado() en Main.java
     * @return the saldo
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * @see ingresar() en Main.java
     * @param cantidad the cantidad to set
     * @throws Exception new Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo=saldo + cantidad;
    }
    /**
     * @see retirar() en Main.java
     * @param cantidad to set
     * @throws Exception new Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo=saldo - cantidad;
    }
}
