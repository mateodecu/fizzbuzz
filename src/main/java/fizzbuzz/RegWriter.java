package fizzbuzz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

public class RegWriter {
	
	//PATRON DE DISEÑO -SINGLETON- PARA QUE SOLO SE UTILICE UNA UNICA INSTANCIA
	//DE CLASE A LA HORA DE ESCRIBIR EL REGISTRO
	
	//VARIABLES DE CLASE
	private ArrayList<String> Fizzbuzz = new ArrayList<String>();
	private final Date date = new Date();
	private static RegWriter regWriter;
    
	//GETTER SINGLETON
	public static RegWriter getSingletonInstance(ArrayList<String> Fizzbuzz) {
		regWriter=new RegWriter(Fizzbuzz);
		return regWriter;
	}
	
    //CONSTRUCTOR
    private RegWriter(ArrayList<String> Fizzbuzz) {
    	this.Fizzbuzz = Fizzbuzz;
    }
    
    //METODOS
    public void writeReg() {
    	try {
    		FileWriter fw = new FileWriter("registro.txt", true);
    		PrintWriter pw = new PrintWriter(fw);
    		pw.println(this.Fizzbuzz.toString());
    		pw.println(this.date.toString());
    		pw.println("");
    		pw.close();
    	}
    	catch (IOException e){
    		System.out.println(e.toString());
    	}
    }
    
}
