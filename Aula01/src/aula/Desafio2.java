package aula;

public class Desafio2 {

	public static void main(String[] args) {
		/*
		 * Crie uma variavel chama precoProduto e coloque um valor para este produto
		 * 
		 * Utilize o comando if para aplicar os seguintes reajustes
		 * 
		 * Se o precoProduto for menor que R$500,00 aplicar um reajuste de 15%
		 * Se o precoProduto for estiver entre R$500,00 e R$800,00 aplicar reajuste de 17,6% 
		 * Se o precoProduto for maior que R$800,00 e menor que R$1.000,00 reajuste de 22%
		 * Se o precoProduto for apartir de R$1.500,00 mostrar a mensagem "Nenhum reajuste"
		 */
		
		double precoProduto=1000;
		System.out.println("Preço: "+precoProduto);
		
		if(precoProduto>=0 && precoProduto<500) {
			System.out.println("Preço Reajustado: "+(precoProduto*1.15));
		}else if(precoProduto>=500 && precoProduto<=800) {
			System.out.println("Preço Reajustado: "+(precoProduto*1.176));
		}else if(precoProduto>=800 && precoProduto<=1000) {
			System.out.println("Preço Reajustado: "+(precoProduto*1.22));
		}else {
			System.out.println("NENHUM REAJUSTE");
		}
		

	}

}
