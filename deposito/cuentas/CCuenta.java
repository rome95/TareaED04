package cuentas;
/**
 * Esta clase se utiliza para crear objetos 
 * @author Jose Luis
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Este constructor basico
     */
    public CCuenta()
    {
    }

    /**
     * Constructor completo con todos los atributos
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Consultar el estado
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Realizar ingreso de cantidad
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retirar una cantidad 
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
 
    /**
     * Realizar opertaiva cuenta
     * @param cantidad 
     */
    public void operativa_cuenta(float cantidad){
        try {
            retirar(cantidad);
            System.out.println("Retirar en cuenta: "+saldo);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            
            ingresar(cantidad);
            System.out.println("Ingresar en cuenta: "+saldo);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
 
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
