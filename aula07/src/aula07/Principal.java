package aula07;

public class Principal {

	public static void main(String[] args) {
		VeiculoCarga vc=new VeiculoCarga();
		VeiculoPassageiro vp=new VeiculoPassageiro();
		
		//Veiculo Carga
		vc.chassi="KKL1234XY";
		vc.placa="ABC1D234";
		vc.cargaMax=5000;
		vc.qdeEixos=3;
		//Veiculo Passageiro
		vp.chassi="XYZ4321AB";
		vp.placa="JKL3X123";
		vp.qdePassageiros=4;
		vp.cambioAutomatico=true;
		
		//Dados Veiculo Carga
		System.out.println("Veiculo Carga: ");
		System.out.println(vc.dadosVeiculo());
		
		//Dados Veiculo Passageiro
		System.out.println("Veiculo Passageiro: ");
		System.out.println(vp.dadosVeiculo());
	}

}
