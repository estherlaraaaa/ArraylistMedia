
package arraylistmedia;

import java.util.ArrayList;


public class ArraylistMedia {
    public double valores;
    
    public ArraylistMedia (double valores){
        this.valores= valores;   
    }
    public double getValores(){
        return valores;
    }
    public void setValores(double valores){
        this.valores= valores; 
    }

  
    public static void main(String[] args) {
       
        ArrayList numeros= new ArrayList();
        
        numeros.add(2.5);
        numeros.add(5.5);
        numeros.add(25.3);
        numeros.add(20.5);
        
        int suma=0;
        int i;
        for (i=0; i<numeros.size();i++){
            suma+= Double.parseDouble(numeros.get(i).toString());   
    }
        System.out.println("La media es: "+ suma/numeros.size());

    }
    
}
