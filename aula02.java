package projetoCaneta;

public class aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.tampar();		
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Strinberg";
		c2.cor = "verde";
		c2.ponta = 1.0f;
		c2.destampar();
		c2.rabiscar();
		c2.status();
	}

}
