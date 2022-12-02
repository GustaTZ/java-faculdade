package aula;

public class ComandoCase {

	public static void main(String[] args) {
		
		char estadoCivil = 'c';
		switch(estadoCivil) {
		case 's':
			System.out.println("Solteiro");
			break;
		case 'd':
			System.out.println("Divorciado");
			break;
		case 'v':
			System.out.println("Viúvo");
			break;
		case 'c':
			System.out.println("Casado");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA!!!");
			break;
		}
	}

}
