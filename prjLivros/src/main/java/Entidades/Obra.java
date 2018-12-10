package Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Obra {
	
	@Id
	private String Codigo;
	private String Titulo, Editora;
    private int NumPaginas, Edicao;

    @ManyToOne
	private Autor autor;
    
    public Obra(String Codigo, String Titulo) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
    }
    
    public Obra() {
       
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
	public Autor getAutor() {
		return autor;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	}

	public int getNumPaginas() {
		return NumPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		NumPaginas = numPaginas;
	}

	public int getEdicao() {
		return Edicao;
	}

	public void setEdicao(int edicao) {
		Edicao = edicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Codigo == null) ? 0 : Codigo.hashCode());
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
		Obra other = (Obra) obj;
		if (Codigo == null) {
			if (other.Codigo != null)
				return false;
		} else if (!Codigo.equals(other.Codigo))
			return false;
		return true;
	}
    
    
}
