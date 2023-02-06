package Jugador;

public class jugador {
	
//-------------VARIABLES DE LA CLASE JUGADOR------------------//
	
        private int dorsal;
        private int numeroTarjetasAmarillas;
        private int numeroTarjetasRojas;

//----------------MÉTODOS DE LA CLASE JUGADOR-----------------//

        public void ponerDorsal(int dorsal) {

                      if(dorsal >= 1 && dorsal <= 30) {

                             this.setDorsal(dorsal);

                      }else {
                             this.setDorsal(-1);
                      }
        }

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

}


