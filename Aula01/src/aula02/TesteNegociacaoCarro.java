package aula02;

public class TesteNegociacaoCarro {
	public static void main(String[] args) {
		
		Carro novoCarro = new Carro();
		novoCarro.setMarca("VW");
		novoCarro.setModelo("Fox");
		novoCarro.setCor("Azul");
		novoCarro.setKm(15560);
		novoCarro.setCapacidadeTanque(50);
		novoCarro.setKmPorLitro(12);
		novoCarro.setPreco(28500);
		
		System.out.println("Marca: " + novoCarro.getMarca());
		System.out.println("Modelo: " + novoCarro.getModelo());
		System.out.println("Cor: " + novoCarro.getCor());
		System.out.println("Quilometragem: " + novoCarro.getKm());
		System.out.println("Rodagem do Veículo: " + novoCarro.calcularKm());
		System.out.println("Preço: " + novoCarro.getPreco());
		System.out.println("Desconto: " + novoCarro.calcularDesconto(2.5,2));
		System.out.println("Valor Com Desconto: " + novoCarro.getValorComDesconto());
		
	}
}
