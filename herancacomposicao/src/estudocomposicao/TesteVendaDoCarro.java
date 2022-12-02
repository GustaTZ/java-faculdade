package estudocomposicao;

import exemplo.Carro;
import exemplo.Comprador;
import exemplo.Vendedor;

public class TesteVendaDoCarro {

	public static void main(String[] args) {
		
		Vendedor vendedor1 = new Vendedor("Paulo Souza","111","1111");
		Vendedor vendedor2= new Vendedor("Maria Torres","222","2222");
		Vendedor vendedor3= new Vendedor("Joaz Fernandes","333","3333");
		Comprador comprador1= new Comprador("Cleber João","444","4444");
		Comprador comprador2= new Comprador("Marcos Silva","555","5555");
		Comprador comprador3= new Comprador("Matheus Juan","666","6666");
		
		Carro carro1= new Carro("VW","FOX","Azul",25000,vendedor2,comprador1);
		System.out.println("Marca: "+carro1.getMarca());
		System.out.println("Modelo: "+carro1.getModelo());
		System.out.println("Cor: "+carro1.getCor());
		System.out.println("Preço: "+ carro1.getPreco());
		System.out.println("---------------");
		System.out.println("Vendedor: "+carro1.getVendedor().getNome());
		System.out.println("RG: "+carro1.getVendedor().getRg());
		System.out.println("CPF: "+carro1.getVendedor().getCpf());
		System.out.println("---------------");
		System.out.println("Comprador: "+carro1.getComprador().getNome());
		System.out.println("RG: "+carro1.getComprador().getRg());
		System.out.println("CPF: "+carro1.getComprador().getCpf());
		System.out.println();
		System.out.println();
		
		Carro carro2= new Carro("Renault","SANDERO","Laranja",75000,vendedor3,comprador2);
		System.out.println("Marca: "+carro2.getMarca());
		System.out.println("Modelo: "+carro2.getModelo());
		System.out.println("Cor: "+carro2.getCor());
		System.out.println("Preço: "+ carro2.getPreco());
		System.out.println("---------------");
		System.out.println("Vendedor: "+carro2.getVendedor().getNome());
		System.out.println("RG: "+carro2.getVendedor().getRg());
		System.out.println("CPF: "+carro2.getVendedor().getCpf());
		System.out.println("---------------");
		System.out.println("Comprador: "+carro2.getComprador().getNome());
		System.out.println("RG: "+carro2.getComprador().getRg());
		System.out.println("CPF: "+carro2.getComprador().getCpf());
		System.out.println();
		System.out.println();
		
		Carro carro3= new Carro("Mercedes","Sprinter","Preto",85000,vendedor1,comprador3);
		System.out.println("Marca: "+carro3.getMarca());
		System.out.println("Modelo: "+carro3.getModelo());
		System.out.println("Cor: "+carro3.getCor());
		System.out.println("Preço: "+ carro3.getPreco());
		System.out.println("---------------");
		System.out.println("Vendedor: "+carro3.getVendedor().getNome());
		System.out.println("RG: "+carro3.getVendedor().getRg());
		System.out.println("CPF: "+carro3.getVendedor().getCpf());
		System.out.println("---------------");
		System.out.println("Comprador: "+carro3.getComprador().getNome());
		System.out.println("RG: "+carro3.getComprador().getRg());
		System.out.println("CPF: "+carro3.getComprador().getCpf());

	}

}
