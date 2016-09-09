
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Nomina {

    private String codemp;
    private String cedula;
    private String primNom;
    private String segNom;
    private String primApel;
    private String segApel;
    private double descuentoNomina;
    private double sueldo;
    private String cargo;
    DecimalFormat df = new DecimalFormat("\"###,###.##\"");
    DecimalFormat df1 = new DecimalFormat("\"###,###\"");
   
    public double descuentoSalud() {
        double salud;
        salud = sueldo * 0.085;
        return salud;
    }

    public double descuentoPension() {
        double pension;
        pension = sueldo * 0.12;
        return pension;
    }

    public void setDescuentoNomina(double descuentoNomina) {
        if (descuentoNomina > sueldo) {
            this.descuentoNomina = 0;
            System.out.println("No se puede Hacer descuento no tiene cupo");
        } else {
            this.descuentoNomina = descuentoNomina;
        }
    }

    public double totalAPagarNomina() {
        return sueldo - descuentoNomina - descuentoSalud() - descuentoPension();
    }

    public void descontar(){
        descuentoSalud();
        descuentoPension();
    }
    
    public void mostrarDatos() {
            System.out.println("Mostrar Datos Empleados");
            System.out.println("Codigo Empleado "+codemp);
            System.out.println("Cedula Empleado: "+cedula);
            System.out.println("Primer Nombre Empleado: "+primNom);
            System.out.println("Segundo Nombre Empleado: "+segNom);
            System.out.println("primer Apellido Empleado: "+primApel);
            System.out.println("Segundo Apellido Empleado: "+segApel);
            System.out.println("Sueldo : "+df.format(sueldo));
            
            System.out.println("Descuento en Salud(-): "+df1.format(descuentoSalud()));
            System.out.println("Descuento en Pension(-):"+descuentoPension());
            if(descuentoNomina!=0){
              System.out.println("Descuento Nomina(-):"+df.format(descuentoNomina));
             
            }
            System.out.println("----------------------------------------------");
            System.out.println("Pago:                   "+totalAPagarNomina());
      
    }

    public void setCodemp(String codemp) {
        this.codemp = codemp;
    }

    public String getCodemp() {
        return this.codemp;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrimNom() {
        return primNom;
    }

    public void setPrimNom(String primNom) {
        this.primNom = primNom;
    }

    public String getSegNom() {
        return segNom;
    }

    public void setSegNom(String segNom) {
        this.segNom = segNom;
    }

    public String getPrimApel() {
        return primApel;
    }

    public void setPrimApel(String primApel) {
        this.primApel = primApel;
    }

    public String getSegApel() {
        return segApel;
    }

    public void setSegApel(String segApel) {
        this.segApel = segApel;
    }

    public double getDescuentoNomina() {
        return descuentoNomina;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
