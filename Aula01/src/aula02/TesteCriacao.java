package aula02;

public class TesteCriacao {

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
	System.out.println("Desconto: " + novoCarro.calcularDesconto(2.5));
	System.out.println("Valor Com Desconto: " + novoCarro.getValorComDesconto());
	
	System.out.println();
	
	Carro novoCarro2 = new Carro(2350);
	novoCarro2.setMarca("Chevrolet");
	novoCarro2.setModelo("Onix");
	novoCarro2.setCor("Preto");
	//novoCarro2.setKm(2350);
	novoCarro2.setCapacidadeTanque(45);
	novoCarro2.setKmPorLitro(10);
	novoCarro2.setPreco(30000);
	
	System.out.println("Marca: " + novoCarro2.getMarca());
	System.out.println("Modelo: " + novoCarro2.getModelo());
	System.out.println("Cor: " + novoCarro2.getCor());
	System.out.println("Quilometragem: " + novoCarro2.getKm());
	System.out.println("Rodagem do Veículo: " + novoCarro2.calcularKm());
	System.out.println("Preço: " + novoCarro2.getPreco());
	System.out.println("Desconto: " + novoCarro2.calcularDesconto(2.5,1));
	System.out.println("Valor Com Desconto: " + novoCarro2.getValorComDesconto());
	
	System.out.println();
	
	Carro novoCarro3 = new Carro("Fiat","Palio","Prata",0,47,14,33650);
	
	System.out.println("Marca: " + novoCarro3.getMarca());
	System.out.println("Modelo: " + novoCarro3.getModelo());
	System.out.println("Cor: " + novoCarro3.getCor());
	System.out.println("Quilometragem: " + novoCarro3.getKm());
	System.out.println("Rodagem do Veículo: " + novoCarro3.calcularKm());
	System.out.println("Preço: " + novoCarro3.getPreco());
	System.out.println("Desconto: " + novoCarro3.calcularDesconto(2,1.5));
	System.out.println("Valor Com Desconto: " + novoCarro3.getValorComDesconto());
	
	System.out.println();
	
	Carro novoCarro4 = new Carro("Ford","Fiesta","Prata",7500,40,15,23380);
	
	System.out.println("Marca: " + novoCarro4.getMarca());
	System.out.println("Modelo: " + novoCarro4.getModelo());
	System.out.println("Cor: " + novoCarro4.getCor());
	System.out.println("Quilometragem: " + novoCarro4.getKm());
	System.out.println("Rodagem do Veículo: " + novoCarro4.calcularKm());
	System.out.println("Preço: " + novoCarro4.getPreco());
	System.out.println("Desconto: " + novoCarro4.calcularDesconto(2,1));
	System.out.println("Valor Com Desconto: " + novoCarro4.getValorComDesconto());
	
	System.out.println("======================================");
	System.out.println("Quantidade de Carros: " + Carro.getTotalCarros());
	

}

}
