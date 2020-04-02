package frb.edu.br;


public class Martelo extends Thread{
    private String produto;
    private int quantidade;
    private int tempo;

    public Martelo(String produto, int quantidade, int tempo) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        for(int i = 1; i<= quantidade; i++){
            System.out.println("Prega " + produto + " :: " + i);
            try {
                sleep( (long) (Math.random() * tempo) );
            } catch (InterruptedException e) {
                System.out.println("Erro " + e);
            }
            System.out.println("Martelo finaliza o " + produto);
        }
    }
    
    
            
    
}
