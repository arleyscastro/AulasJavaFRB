package frb.edu.br.aula8.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendedor")
public class Vendedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idvendedor;
	
	@Column(name = "nome", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "comissao", nullable = false)
	private double comissao;
	
	
	public Vendedor() {
	}


	


	public long getIdvendedor() {
		return idvendedor;
	}





	public void setIdvendedor(long idvendedor) {
		this.idvendedor = idvendedor;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public double getComissao() {
		return comissao;
	}





	public void setComissao(double comissao) {
		this.comissao = comissao;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(comissao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (idvendedor ^ (idvendedor >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		if (Double.doubleToLongBits(comissao) != Double.doubleToLongBits(other.comissao))
			return false;
		if (idvendedor != other.idvendedor)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	
	

}
