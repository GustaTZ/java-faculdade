package aula07;

public class Veiculo {
	String chassi,placa;
	
	public String dadosVeiculo() {
		String dados="";
		dados+="Chassi: "+chassi+"\n";
		dados+="Placa: "+placa+"\n";
		return dados;
	}
}
