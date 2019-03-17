package fizzbuzz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzbuzzController {
	
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