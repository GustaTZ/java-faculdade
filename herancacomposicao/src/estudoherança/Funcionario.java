package estudoherança;

public class Funcionario {
	
	protected int matricula;
	protected String nome;
	protected double salarioBruto;
	protected double bonificação;
	
    public Funcionario(int matricula, String nome, double salarioBruto, double bonificação) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.bonificação = bonificação;
	}
	public double calcularBonificação() {
    	return this.salarioBruto* 0.05;
    	
    }
   
	@Override
	public String toString() {
		return "Matricula: "+this.matricula
		+"\nNome: "+ this.nome
		+"\nSalario Bruto: "+this.salarioBruto
		+"\nBonificação: "+this.bonificação;
	}
	
 
public Funcionario() {
}
public void setMatricula(int matricula) {
	this.matricula = matricula;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getSalarioBruto() {
	return salarioBruto;
}
public void setSalarioBruto(double salarioBruto) {
	this.salarioBruto = salarioBruto;
}
public double getBonificação() {
	return bonificação;
}
public void setBonificação(double bonificação) {
	this.bonificação = bonificação;
}
public int getMatricula() {
	return matricula;
}
 	public boolean equals(Object obj) {
 		Funcionario func=(Funcionario)obj;
 		return this.nome.equals(func.getNome());
 	}
 @Override
 public int hashCode() {
	 return super.hashCode();
	 
	 
	
 }
}
