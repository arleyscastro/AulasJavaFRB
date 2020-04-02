package chat;

import java.io.BufferedReader;
import java.io.IOException;

public class Leitor extends Thread{
    BufferedReader is = null;

    public Leitor(BufferedReader is) {
        super("Cliente");
        this.is = is;
    }

    @Override
    public void run() {
        if(is != null){
            try {
                String doservidor;
                while( (doservidor = is.readLine()) != null ){
                    System.out.println("O servidor disse:" + doservidor);
                    if(doservidor.equalsIgnoreCase("bye")){
                        break;
                    }
                }
                System.out.println("Fim da conexão !!!!");
            } catch (IOException e) {
                System.out.println("Erro :" + e);
            }
        }
    }
    
    
    
}
