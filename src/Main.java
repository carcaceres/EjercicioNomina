/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nomina nomina =new Nomina();
        nomina.setCedula("123456");
        nomina.setCodemp("cc123456");
        nomina.setPrimNom("carlos");
        nomina.setSegNom("jose");
        nomina.setPrimApel("caceres");
        nomina.setSegApel("ochoa");
        nomina.setSueldo(10000000);
        nomina.setDescuentoNomina(20000);
        nomina.descontar();
        nomina.mostrarDatos();
        
    }
    
}
