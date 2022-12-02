package estudocomposicao;
import java.util.ArrayList;
public class TesteArrayList {
	public static void main(String[]args) {
		ArrayList<String>nomes=new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Pedro");
		nomes.add("Carlos");
		
		for(String nome:nomes) {
			System.out.println(nome);
		}
		System.out.println();
		
		nomes.add("Fulano de Tal");
		for(String nome:nomes) {
			System.out.println(nome);
		}
		System.out.println("--->"+nomes.get(3));
		
		System.out.println();
		nomes.remove(2);
		for(String nome:nomes) {
			System.out.println(nome);
		}
	}
}
