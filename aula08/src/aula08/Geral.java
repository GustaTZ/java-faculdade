package aula08;

public class Geral {

	int a,b;
	public Geral() {
		System.out.println("Vazio");
	}
	public Geral(int a) {
		System.out.println(a);
	}
	public Geral(int a, int b) {
		System.out.println(a+b);
	}
/* Sobrecarga, nome igual com função diferente
 	public Geral(int a, int b) {
		System.out.println(a-b);
	}*/
}
