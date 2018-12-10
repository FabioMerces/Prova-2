package Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.eclipse.persistence.annotations.PrimaryKey;
import org.eclipse.persistence.oxm.annotations.XmlNullPolicy;

@Entity
public class Autor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String CPF;
	private String Nome, Pseudonimo, Nacionalidade, DataNascimento;

    @OneToMany(mappedBy="autor")
	private List<Obra> obras = new ArrayList<Obra>();

	public Autor(String CPF, String Nome){
        this.CPF = CPF;
        this.Nome = Nome;
    }
    
    public Autor(){
       
    }

    public List<Obra> getObras() {
		return obras;
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}
	
	public void addObra(Obra obra)
	{
		obras.add(obra);
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getPseudonimo() {
		return Pseudonimo;
	}

	public void setPseudonimo(String pseudonimo) {
		Pseudonimo = pseudonimo;
	}

	public String getNacionalidade() {
		return Nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		Nacionalidade = nacionalidade;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
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
		Autor other = (Autor) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		return true;
	}
    
    
    
}
