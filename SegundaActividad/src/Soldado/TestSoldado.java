package Soldado;
import org.junit.Test;

public class TestSoldado {
	
	 @Test
	  public void testPuedeDisparar() {
		 Soldado sol = new Soldado();
	        sol.setNumeroBalas(1);
	        sol.puedeDisparar();
	        if (sol.puedeDisparar() == true) {
	        	System.out.print ( "Puede disparar");
	        }  else {
	        		System.out.print ( "No puede disparar" );
	        
	        		} 
	 }     	
	 

	 @Test
	 public void testDisparar(Soldado sol) {
	      Soldado sol1= new Soldado ();
	      sol1.setNumeroBalas(1);
	      int balas =sol1.getNumeroBalas();
	      		if (balas > 0 ) {
	      			sol1.setEstaMuerto(true);
	      		} else if ((balas < 0) || (balas == 0)) {
	      			sol1.setEstaMuerto(false);
	      		}
	      }       	
	
}	 



