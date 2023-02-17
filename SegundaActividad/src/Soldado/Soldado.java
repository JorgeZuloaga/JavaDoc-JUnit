package Soldado;

/**

La clase Soldado representa a un soldado con un número de balas y un estado de vida.

Tiene métodos para determinar si el soldado puede disparar y para hacer que el soldado dispare.
*/

public class Soldado {
//-------------VARIABLES DE LA CLASE SOLDADO------------------//
	
	   private boolean estaMuerto;
       private int numeroBalas;
       private int dorsal;
       
//------------------------MÃ‰TODOS---------------------------//       
	
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

	Hace que el soldado dispare, disminuyendo su número de balas y estableciendo a otro soldado como muerto.
	@param sol el soldado que será disparado
	*/
	
       public void disparar(Soldado sol) {

           this.numeroBalas--;

           sol.setEstaMuerto(true);
           
           
}
       
//----------GET Y SET PARA VARIBLES PRIVADAS---------//
       
       /**
       Obtiene el estado de vida del soldado.
       @return true si el soldado está muerto, false si está vivo
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

	Obtiene el número de balas del soldado.
	@return el número de balas del soldado
	*/
	
    public int getNumeroBalas() {
		return numeroBalas;
	}
    
    /**

    Establece el número de balas del soldado.
    @param numeroBalas el nuevo número de balas del soldado
    */
    
    public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
       


}

	


       






