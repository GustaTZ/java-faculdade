package aula07;

public class VeiculoPassageiro extends Veiculo{
	int qdePassageiros;
	boolean cambioAutomatico;
	
	@Override
	public String dadosVeiculo() {
		String dados;
		dados = super.dadosVeiculo();
		dados += "Quantidade de Passageiros: " + qdePassageiros + "\n";
		dados += "Cambio automatico: " + cambioAutomatico + "\n";
		return dados;
	}

}