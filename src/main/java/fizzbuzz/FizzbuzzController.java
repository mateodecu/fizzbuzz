package fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// CONTROLLER CLASS

// CLASE CONTROLADOR

@RestController
public class FizzbuzzController {
	
	/*
	MAPS AN HTTP REQUEST TO A JAVA CLASS METHOD USING SOME BASIC CRITERIA
	
	MAPEA UN LLAMADO HTTP A UNA CLASE DE JAVA USINDO CRITERIOS BASICOS
	
	
	
	THE @RequestParam TAG MAPS HTTP REQUEST VALUES TO THE METHOD VARIABLES
	
	LA ETIQUETA @RequestParam MAPEA VALORES DEL LLAMADO HTTP A LAS VARIABLES DEL METODO
	*/
    @RequestMapping("fizzbuzz")
    public String valid(@RequestParam(value="numInicial", defaultValue="0") int numInicial,
			 @RequestParam(value="numRango", defaultValue="10") int numRango) {
    	
    	Fizzbuzz fizzbuzz = new Fizzbuzz (numInicial, numRango);
    	
    	fizzbuzz.crear();
    	
    	RegWriter regWriter = RegWriter.getSingletonInstance(fizzbuzz.getFizzbuzz());
    	
    	regWriter.writeReg();
    	
    	return fizzbuzz.getFizzbuzzString();
    }
    
}