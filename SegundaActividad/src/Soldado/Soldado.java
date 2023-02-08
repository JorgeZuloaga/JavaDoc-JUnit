package Soldado;

public class Soldado {
//-------------VARIABLES DE LA CLASE SOLDADO------------------//
	
	   private boolean estaMuerto;
       private int numeroBalas;
       private int dorsal;
       
//------------------------MÉTODOS---------------------------//       
	
	public boolean puedeDisparar() {

           if(this.numeroBalas > 0) {

                         return true;
           }                          

           return false;
}
	
       public void disparar(Soldado sol) {

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

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
    public int getNumeroBalas() {
		return numeroBalas;
	}
    public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
       


}

	


       






