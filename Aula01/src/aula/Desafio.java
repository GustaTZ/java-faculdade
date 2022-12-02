package aula;

public class Desafio {

	public static void main(String[] args) {
	/*
		Cria 4 variáveis e coloque uma nota entre 0 e 10 para cada uma delas
		Efetue o cálculo da média e armazene o resultado em outra variável
		Utilize o comando "if" com as seguintes opções:
		--> Média maior ou igual a 7, mostrar o texto "APROVADO"
		--> Média maior ou igual que 5 e menor que 7, mostrar o texto "RECUPERAÇÃO"
		--> Média menor 5, mostrar o texto "REPROVADO"
		--> Senão mostrar Nota Inválida!!!!
	*/
		double nota1=1;
		double nota2=1;
		double nota3=1;
		double nota4=1;
		double media = (nota1+nota2+nota3+nota4)/4;
		if(media>=7 && media<=10) {
			System.out.println("Aprovado: "+media);
		}else if(media>=5 && media<7) {
			System.out.println("Recuperação: "+media);
		}else if(media>=0 && media<5) {
			System.out.println("Reprovado: "+media);
		}else {
			System.out.println("NOTA INVALIDA!!");
		}
	}

}
