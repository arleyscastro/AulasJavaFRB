package frb.edu.br.aula8.caculadora;

public class ConverteNumero {
	
	public static Double converteParaDouble(String strNumero) {
		if(strNumero == null) return 0d;
		String numero = strNumero.replaceAll(",", ".");
		if( isNumeric(numero) ) return Double.parseDouble(numero);
		return 0d;
	}

	public static boolean isNumeric(String strNum) {
		
		if(strNum == null) return false;
		
		String num = strNum.replaceAll(",", ".");
		
		return num.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
