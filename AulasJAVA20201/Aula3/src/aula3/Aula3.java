package aula3;

import frb.edu.br.ChaveInglesa;
import frb.edu.br.Martelo;


public class Aula3 {


    public static void main(String[] args) {
        Martelo m1 = new Martelo("Prego Pequeno",10 , 100);
        Martelo m2 = new Martelo("Prego Grande", 10, 100);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.setPriority(Thread.MIN_PRIORITY);
        m1.start();
        m2.start();
        
        
        ChaveInglesa c1 = new ChaveInglesa("rosca pequena", 10, 100);
        ChaveInglesa c2 = new ChaveInglesa("rosca grande", 10, 100);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
    
}
