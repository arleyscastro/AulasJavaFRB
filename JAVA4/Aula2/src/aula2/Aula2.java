package aula2;

import java.util.List;
import model.ListaPessoa;
import model.Pessoa;


public class Aula2 {


    public static void main(String[] args) {
        ListaPessoa lista = new ListaPessoa();
        
//        List<Pessoa> lst = lista.getPessoas();
//        for(int i=0; i< lst.size(); i++){
//            System.out.println(lst.get(i).getNome());
//            System.out.println(lst.get(i).getCpf());
//            System.out.println(lst.get(i).getIdade());
//        }

      lista.setPessoa( new Pessoa("09876", "Maria", 25));

        for (Pessoa pessoa : lista.getPessoas()) {
            System.out.println("Nome :" + pessoa.getNome());
            System.out.println("CPF  :" + pessoa.getCpf());
            System.out.println("Idade:" + pessoa.getIdade());
            System.out.println("----------------------------------");
        }
        
    }
    
}
