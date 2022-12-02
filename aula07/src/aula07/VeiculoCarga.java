package aula07;

public class VeiculoCarga extends Veiculo{
	int cargaMax, qdeEixos;
	
	@Override
	public String dadosVeiculo() {
		String dados;
		dados = super.dadosVeiculo();
		dados += "Carga máxima: " + cargaMax + "\n";
		dados += "Quantidade de eixos: " + qdeEixos + "\n";
		return dados;
	}

}