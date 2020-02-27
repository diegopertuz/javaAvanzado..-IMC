/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author CBN
 */
public class IMC {
    public IMC(){
    
}
public  double IMCgenero(double pesos,double estaturas, int genero){
         String est;
        double IMC = pesos/(estaturas*estaturas);
        switch(genero){
        case 1:
                
        if(IMC<20){
              est="bajopeso";
        } else if (IMC>20 && IMC<27) {
            est ="normopeso";
        }else if (IMC<27 && IMC<30) {
           est = "sobrepeso"; 
        }else if (IMC>30 && IMC<40) {
            est= "obesidad";
        }
        break;
        case 2:
                
        if(IMC<20){
              est="bajopeso";
        } else if (IMC>20 && IMC<25) {
            est ="normopeso";
        }else if (IMC<25 && IMC<30) {
           est = "sobrepeso"; 
        }else if (IMC>30 && IMC<40) {
            est= "obesidad";
        }
         break;
        }
     
        
   return IMC;
    }
   



}

 