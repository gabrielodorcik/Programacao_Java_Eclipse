/**
 * 
 */
package DefiCane;

public class Pensil {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "azul";
		c1.dono = "Gabriel";
		c1.ponta = 0.5f;
		c1.carga = 15;
		c1.tampada = true;
		
		
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Compactor Economic";
		c2.cor = "Vermelha";
		c2.dono = "Josué";
		c2.ponta = 0.7f;
		c2.carga = 98;
		c2.tampada = false;
		
		c2.status();
		c2.rabiscar();
		
		Caneta c3 = new Caneta();
		c3.modelo = "Kilimetrica";
		c3.cor = "Preta";
		c3.dono = "Carlos";
		c3.ponta = 1.0f;
		c3.carga = 50;
		c3.tampada = true;
		
		c3.status();
		c3.rabiscar();
	}

}
