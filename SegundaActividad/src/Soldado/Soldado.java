package Soldado;

/**
La clase Soldado representa a un soldado con un n�mero de balas y un estado de vida.
Tiene m�todos para determinar si el soldado puede disparar y para hacer que el soldado dispare.
 @author JORGE
*/

public class Soldado {
//-------------VARIABLES DE LA CLASE SOLDADO------------------//
	
       private boolean estaMuerto;
       private int numeroBalas;
       private int dorsal;
       
//------------------------MÉTODOS---------------------------//       
	
       /**

       Comprueba si el soldado tiene balas suficientes para disparar.
       @return true si el soldado tiene balas, false si no tiene balas
       */
       
	public boolean puedeDisparar() {

           if(this.numeroBalas > 0) {

                         return true;
           }                          

           return false;
}
	
	/**

	Hace que el soldado dispare, disminuyendo su n�mero de balas y estableciendo a otro soldado como muerto.
	@param sol el soldado que ser� disparado
	*/
	
       public void disparar(Soldado sol) {

           this.numeroBalas--;

           sol.setEstaMuerto(true);
           
           
}
       
//----------GET Y SET PARA VARIBLES PRIVADAS---------//
       
       /**
       Obtiene el estado de vida del soldado.
       @return true si el soldado est� muerto, false si est� vivo
       */
       
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	
	/**

	Establece el estado de vida del soldado.
	@param estaMuerto el nuevo estado de vida del soldado
	*/

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	
	/**

	Obtiene el dorsal del soldado.
	@return el dorsal del soldado
	*/

	public int getDorsal() {
		return dorsal;
	}
	
	/**

	Establece el dorsal del soldado.
	@param dorsal el nuevo dorsal del soldado
	*/

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	/**

	Obtiene el n�mero de balas del soldado.
	@return el n�mero de balas del soldado
	*/
	
    public int getNumeroBalas() {
		return numeroBalas;
	}
    
    /**

    Establece el n�mero de balas del soldado.
    @param numeroBalas el nuevo n�mero de balas del soldado
    */
    
    public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
       


}

	


       






