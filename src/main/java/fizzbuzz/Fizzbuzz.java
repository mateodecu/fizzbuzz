package fizzbuzz;

import java.util.ArrayList;

public class Fizzbuzz {

	//VARIABLES DE CLASE
    private final int numInicial;
    private final int numRango;
    private final ArrayList<String> Fizzbuzz = new ArrayList<String>();
    
    //CONSTRUCTOR
    public Fizzbuzz(int numInicial, int numRango) {
        this.numInicial = numInicial;
        this.numRango = numRango;
    }
    
    //GETTER
    public ArrayList<String> getFizzbuzz() {
    	return Fizzbuzz;
    }
    
    //GETTER
    public String getFizzbuzzString() {
    	return Fizzbuzz.toString();
    }
    
    //METODOS
    public void crear() {
    	for(int i = numInicial; i < numInicial+numRango; i++) {
    		if(i % 3 == 0 & i % 5 == 0) {
    			Fizzbuzz.add("Fizzbuzz");
       		}
    		else if(i % 3 == 0) {
    			Fizzbuzz.add("Fizz");
       		}
    		else if(i % 5 == 0){
    			Fizzbuzz.add("Buzz");
       		}
       		else {
       			Fizzbuzz.add(Integer.toString(i));
       		}
    	}
    }
    
}