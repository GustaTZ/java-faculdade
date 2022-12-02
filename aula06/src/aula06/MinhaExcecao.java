package aula06;

class MinhaExcecao extends Exception {
	private int n;
	MinhaExcecao(int n){
		this.n=n;
	}
	public String toString() {
		return "Minha exceçao: "+n;
	}
}
