package frb.edu.br.aula8.caculadora;

public class SimplesCalculadora {
	
	public Double soma(Double num1, Double num2) {
		return num1 + num2;
	}
	
	public Double subtracao(Double num1, Double num2) {
		return num1 - num2;
	}
	
	public Double multiplicacao(Double num1, Double num2) {
		return num1 * num2;
	}
	
	public Double divisao(Double num1, Double num2) {
		return num1 / num2;
	}
	
	public Double media(Double num1, Double num2) {
		return (num1 + num2) /2.0F;
	}
	
	public Double raiz(Double num1) {
		return (Double)Math.sqrt(num1);
	}

}
