package DefiCane;
public class Caneta {
		String modelo;
		String cor;
		String dono;
		float ponta;
		int carga;
		boolean tampada;
		void status() {
			System.out.println("Qual o modelo da caneta? O modelo é " + this.modelo);
			System.out.println("Qual a sua cor? Sua cor é " + this.cor );
			System.out.println("Quem é o dono da caneta? O dono é " + this.dono);
			System.out.println("Qual é a ponta? A sua ponta é " + this.ponta);
			System.out.println("Qual é a sua carga atual? A sua carga é de " + this.carga + "%");
			
		}
		
		
		void rabiscar() {
			if (this.tampada == true) {
				System.out.println("Ela está tampada, não consigo rabiscar!");
			} else {
				System.out.println("Não está tampada, eu consigo rabiscar!");
			}
		}
		
		void tampar() {
			this.tampada = true;
		}
		
		void destampar() {
			this.tampada = false;
		}
}
