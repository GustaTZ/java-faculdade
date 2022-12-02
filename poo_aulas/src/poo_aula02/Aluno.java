package poo_aula02;

public class Aluno {
	
	int ra;
	String nome;
	String curso;
	
	public int getRA() {
	    return ra;
	}
	public void setRA(int ra) {
	    this.ra = ra;
	}
	public String getNome() {
	    return nome;
	}
	public void setNome(String nome) {
	    this.nome = nome;
	}
	public String getCurso() {
	    return curso;
	}
	public void setCurso(String curso) {
	    this.curso = curso;
	}
public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setRA(123456789);
		a1.setNome("Caio");
		a1.setCurso("TADS");
		System.out.println(a1.getRA());
		System.out.println(a1.getNome());
		System.out.println(a1.getCurso());
		
	}

}