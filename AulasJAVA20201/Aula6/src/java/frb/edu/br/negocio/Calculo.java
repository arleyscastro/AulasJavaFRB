
package frb.edu.br.negocio;


public class Calculo {
    private double peso;
    private double altura;
    private double imc;
    private String classificacao;

    public Calculo() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        imc = peso/ (altura * altura);
        
        if(imc < 16F){
            classificacao = "magreza grave";
        }else{
            if(imc >= 16F && imc < 17F){
                classificacao = "magreza moderada";
            }else{
                if(imc >= 17F && imc < 18.5F){
                    classificacao = "magreza leve";
                }else{
                    if(imc >= 18.5F && imc < 25F){
                        classificacao = "Saudável";
                    }else{
                        if(imc >= 25F && imc < 30F){
                            classificacao = "Sobrepeso";
                        }else{
                            if(imc >= 30F && imc < 35F){
                                classificacao = "obesidade grai 1";
                            }else{
                                if(imc >= 35F && imc < 40F){
                                    classificacao = "obesidade grai 2 (severa)";
                                }else{
                                    classificacao = "obesidade grai 3 (mórbida)";
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return imc;
    }

    public String getClassificacao() {
        return classificacao;
    }
    
    
    
    
}
