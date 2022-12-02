package metodomain;

public class AprendendoSobreMetodoMain {
	
	public static void main(String[] args) {
		
		System.out.println("Executando o metodo main()");
		meuMetodo(args);
			}
	public static void meuMetodo(String[]args) {
		System.out.println("Executando o metodo meuMetodo()");
			for(String nome:args) {
				System.out.println(nome);
			}
	}
}
