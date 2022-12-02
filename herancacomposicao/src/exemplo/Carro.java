package exemplo;

public class Carro {
	
	public Carro(String marca, String modelo, String cor, double preco, Vendedor vendedor, Comprador comprador) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.vendedor = vendedor;
		this.comprador = comprador;
	}
	
	private String marca;
	private String modelo;
	private String cor;
	private double preco;
	private Vendedor vendedor;
	private Comprador comprador;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	
}
