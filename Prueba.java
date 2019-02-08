/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author alu2018451
 */
public class Prueba {
    String holaa;
    int num= 2;
    String cambiodecodigoMiquel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
          
        
        coche carro = new coche();
        coche car = new coche();
        
        car.setMatricula(4765);
       carro.setMatricula(10);
   
        System.out.println(carro.getMatricula());
    }
    /**
     * 
     * @param saludo
     * @param numero 
     */
public Prueba (String saludo, int numero) {
    
this.holaa = saludo;
this.num = 4;
    

}

}
