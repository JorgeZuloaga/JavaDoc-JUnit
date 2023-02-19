package Jugador;
/**
 * Clase Jugador, se le asigna numero de dorsal y se indica si
 * es expulsado por tarjetas
 * @author josei
 *
 */

public class jugador {
	
//-------------VARIABLES DE LA CLASE JUGADOR------------------//
	
        private int dorsal;
        private int numeroTarjetasAmarillas;
        private int numeroTarjetasRojas;

//----------------MÉTODOS DE LA CLASE JUGADOR-----------------//
/**
 * metodo para asignar numero de dorsal al jugador
 * @param numero entero
 */
        public void ponerDorsal(int dorsal) {

                      if(dorsal >= 1 && dorsal <= 30) {

                             this.setDorsal(dorsal);

                      }else {
                             this.setDorsal(-1);
                      }
        }
/**
 * metodo para contabilizar tarjetas recibidas y si tiene que ser expulsado
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
//--------------GET Y SET PARA VARIBLES PRIVADAS-------------//
        
		public int getDorsal() {
			return dorsal;
		}

		public void setDorsal(int dorsal) {
			this.dorsal = dorsal;
		}
		public int getNumeroTarjetasAmarillas() {
			return numeroTarjetasAmarillas;
		}
		public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
			this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		}
		public int getNumeroTarjetasRojas() {
			return numeroTarjetasRojas;
		}
		public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
			this.numeroTarjetasRojas = numeroTarjetasRojas;
		}     
		
		

}


