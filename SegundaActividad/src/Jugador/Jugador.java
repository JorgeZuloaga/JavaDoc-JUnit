package Jugador;

/**
 * Clase que representa a un jugador de fútbol.
 */

public class Jugador {
	
//-------------VARIABLES DE LA CLASE JUGADOR------------------//
	
        private int dorsal;
    	private int numeroTarjetasAmarillas;
        private int numeroTarjetasRojas;
        
        
        /**
         * Asigna un dorsal al jugador.
         * Si el dorsal está entre 1 y 30 inclusive, se asigna al jugador.
         * Si el dorsal no está en ese rango, se establece como -1.
         * @param dorsal el dorsal a asignar al jugador
         */
        	

//----------------MÃ‰TODOS DE LA CLASE JUGADOR-----------------//

        public void ponerDorsal(int dorsal) {

                      if(dorsal >= 1 && dorsal <= 30) {

                             this.setDorsal(dorsal);

                      }else {
                             this.setDorsal(-1);
                      }
        }
        
        
        /**
         * Indica si el jugador está expulsado o no.
         * El jugador está expulsado si tiene dos tarjetas amarillas o una tarjeta roja.
         * @return true si el jugador está expulsado, false en caso contrario
         */
        

        public boolean estaExpulsado() {

                      boolean expulsado = false;                                                  

                      if(numeroTarjetasAmarillas == 2) {

                                    expulsado = true;

                      }                          

                      if(numeroTarjetasRojas == 1) {

                                    expulsado = true;

                      }                          

                      return expulsado;

        }
        
        /**
         * Obtiene el dorsal del jugador.
         * @return el dorsal del jugador
         */
        
        
//--------------GET Y SET PARA VARIBLES PRIVADAS-------------//
        
		public int getDorsal() {
			return dorsal;
		}
		
		  /**
	     * Asigna un dorsal al jugador.
	     * @param dorsal el dorsal a asignar al jugador
	     */

		public void setDorsal(int dorsal) {
			this.dorsal = dorsal;
		}    
		
		/**
	     * Obtiene el número de tarjetas amarillas del jugador.
	     * @return el número de tarjetas amarillas del jugador
	     */
		
	    public int getNumeroTarjetasAmarillas() {
				return numeroTarjetasAmarillas;
			}
	    
	    /**
	     * Asigna el número de tarjetas amarillas del jugador.
	     * @param numeroTarjetasAmarillas el número de tarjetas amarillas a asignar al jugador
	     */

		public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
				this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
			}
		
		/**
	     * Obtiene el número de tarjetas rojas del jugador.
	     * @return el número de tarjetas rojas del jugador
	     */

		public int getNumeroTarjetasRojas() {
				return numeroTarjetasRojas;
			}
		
		 /**
	     * Asigna el número de tarjetas rojas del jugador.
	     * @param numeroTarjetasRojas el número de tarjetas rojas a asignar al jugador
	     */

		public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
				this.numeroTarjetasRojas = numeroTarjetasRojas;
			}


}


