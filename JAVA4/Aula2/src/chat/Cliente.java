package chat;

import java.io.*;
import java.net.*;

public class Cliente {
    
    public static void main(String[] args) {
        int porta = 4444;
        String ipaddr = "127.0.0.1";
        
        Socket kksocket = null;
        PrintWriter os = null;
        BufferedReader is = null;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
                
        try {
            kksocket = new Socket(ipaddr, porta);
            is = new BufferedReader(new InputStreamReader(kksocket.getInputStream()));
            os = new PrintWriter(kksocket.getOutputStream());
        } catch (IOException e) {
            System.out.println("Erro " + e);
            System.exit(1);
        }
        
        Leitor meuleitor = new Leitor(is);
        meuleitor.start();
        
        System.out.println("Conectado [SERVIDOR]");
        
        if(kksocket != null && os != null && is != null){
            try {
                String docliente;
                while( (docliente = stdin.readLine()) != null  ){
                    if(docliente.equalsIgnoreCase("bye")){
                        break;
                    }
                    os.println(docliente);
                    os.flush();
                }
                meuleitor.stop();
                os.close();
                is.close();
                kksocket.close();
                
            } catch (IOException e) {
                System.out.println("Erro " + e);
            }
        }
        
        
    }
}
