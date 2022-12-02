package aula05a;
import java.util.ArrayList;
public class Lista {
	public static void main(String args[]) {
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		Pessoa pessoaLocal0 = new Pessoa();
		pessoaLocal0.nome1 = "Fulano";
		pessoaLocal0.idade1 = 20;
		pessoaLocal0.email1 = "fulano@teste.com";
		
		listaPessoas.add(pessoaLocal0);
		
		Pessoa pessoaLocal1 = new Pessoa();
		pessoaLocal1.nome1 = "Beltrano";
		pessoaLocal1.idade1 = 25;
		pessoaLocal1.email1 = "beltrano@teste.com";
listaPessoas.add(pessoaLocal1);
		
		Pessoa pessoaLocal2 = new Pessoa();
		pessoaLocal2.nome1 = "Sicrano";
		pessoaLocal2.idade1 = 30;
		pessoaLocal2.email1 = "sicrano@teste.com";
		
		listaPessoas.add(pessoaLocal2);
		
		
		int posicaoRemovida = -1;
		for (int j = 0; j < listaPessoas.size(); j++) {
			if (listaPessoas.get(j).nome1.equals("Beltrano")) {
				posicaoRemovida = j;
				break;
			}
		}
if (posicaoRemovida != -1) {
			listaPessoas.remove(posicaoRemovida);
			System.out.println("O Beltrano estava na posição " + posicaoRemovida);
		}
		
		System.out.println("Imprimindo os nomes da lista atualizada: ");
		
		for (int k = 0; k < listaPessoas.size(); k++) {
			System.out.println(k + " - " + listaPessoas.get(k).nome1);
		}
	
		/*		for (int i = 0; i < listaPessoas.size(); i++) {
		System.out.println("Imprimindo dados da posição: " + i);
		System.out.println("Nome: " + listaPessoas.get(i).nome);
		System.out.println("Idade: " + listaPessoas.get(i).idade);
		System.out.println("Email: " + listaPessoas.get(i).email);
	}
*/

}

}