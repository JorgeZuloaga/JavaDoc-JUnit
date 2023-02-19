package Soldado;
/**
 * Clase Soldado donde puede disparar y matar
 * @author josei
 *
 */
public class soldado {
//-------------VARIABLES DE LA CLASE SOLDADO------------------//
	
	   private boolean estaMuerto;
       private int numeroBalas;
       
       
//------------------------MÉTODOS---------------------------//       
	/**
	 * metodo que indica si tiene balas para poder disparar
	 */
	public boolean puedeDisparar() {

           if(this.numeroBalas > 0) {

                         return true;
           }                          

           return false;
}
	/**
	 * metodo que resta balas por disparar y mata al enemigo
	 * @param objeto de tipo soldado
	 */
       public void disparar(soldado sol) {

           this.numeroBalas--;

           sol.setEstaMuerto(true);
}
       
//----------GET Y SET PARA VARIBLES PRIVADAS---------//
       
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

    public int getNumeroBalas() {
		return numeroBalas;
	}
    public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
       


}

	


       






