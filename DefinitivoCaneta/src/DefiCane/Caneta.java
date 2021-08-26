package DefiCane;
public class Caneta {
		String modelo;
		String cor;
		String dono;
		float ponta;
		int carga;
		boolean tampada;
		void status() {
			System.out.println("Qual o modelo da caneta? O modelo � " + this.modelo);
			System.out.println("Qual a sua cor? Sua cor � " + this.cor );
			System.out.println("Quem � o dono da caneta? O dono � " + this.dono);
			System.out.println("Qual � a ponta? A sua ponta � " + this.ponta);
			System.out.println("Qual � a sua carga atual? A sua carga � de " + this.carga + "%");
			
		}
		
		
		void rabiscar() {
			if (this.tampada == true) {
				System.out.println("Ela est� tampada, n�o consigo rabiscar!");
			} else {
				System.out.println("N�o est� tampada, eu consigo rabiscar!");
			}
		}
		
		void tampar() {
			this.tampada = true;
		}
		
		void destampar() {
			this.tampada = false;
		}
}
