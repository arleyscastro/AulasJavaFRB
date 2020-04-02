package model;

import java.util.LinkedList;
import java.util.List;

public class ListaPessoa {
    
    private List<Pessoa> lst = new LinkedList<Pessoa>();
    
    public List<Pessoa> getPessoas(){
        for(int i = 1; i<=20; i++){
            lst.add( new Pessoa("0" + i, "João " +i, i) );
        }
        return lst;
    }
    
    public void setPessoa(Pessoa pessoa){
        lst.add(pessoa);
    }
}
