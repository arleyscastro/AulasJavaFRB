
package frb.edu.br;


public class ChaveInglesa implements Runnable{
    private String produto;
    private int quantidade;
    private int tempo;

    public ChaveInglesa(String produto, int quantidade, int tempo) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.tempo = tempo;
    }
    
    @Override
    public void run() {
        for(int i = 1; i<= quantidade; i++){
            System.out.println("Aperta " + produto + " :: " + i);
            try {
                Thread.sleep( (long) (Math.random() * tempo) );
            } catch (InterruptedException e) {
                System.out.println("Erro " + e);
            }
            System.out.println("Chave Inglesa finaliza o " + produto);
        }
    }
    
}
