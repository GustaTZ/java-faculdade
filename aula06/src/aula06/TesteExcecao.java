package aula06;

public class TesteExcecao {
	public static void main(String[]args) {
		int x;
		try {
			x=10;
			if(x>10)
			throw new MinhaExcecao(x);
			else System.out.println("x é menor ou igual a 10");
		}
		catch(MinhaExcecao e) {
			System.out.println("Capturada: "+e);
		}
	}

}
