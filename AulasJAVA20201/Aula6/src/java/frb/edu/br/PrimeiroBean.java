package frb.edu.br;

import frb.edu.br.negocio.Calculo;


public class PrimeiroBean {
    private String nome;
    private int anonascimento;
    private double altura;
    private double peso;
    private String classificacao;

    public String getClassificacao() {
        return classificacao;
    }

    
    public PrimeiroBean() {
        this.nome = "Sem nome ainda....";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnonascimento() {
        return anonascimento;
    }

    public void setAnonascimento(int anonascimento) {
        this.anonascimento = anonascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int getCalculaIdade(){
        return 2020 - this.anonascimento;
    }
    
    public double getIndiceDoImc(){
        Calculo calculo = new Calculo();
        double imc;
        calculo.setAltura(altura);
        calculo.setPeso(peso);
        imc = calculo.getImc();
        classificacao = calculo.getClassificacao();
        return imc;
    }
    
}
