package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Autor;
import service.AutorService;

@ManagedBean
@SessionScoped

public class AutorMB {
	private Autor autor = new Autor();
	private AutorService autorService = new AutorService();
	
	public void salvar() {
		autorService.save(autor);
		autorService.closeEntityManager();
		autor = new Autor();
	}
	
	public List<Autor> getAutors(){
		List <Autor> lista;
		lista = autorService.getAll(Autor.class);
		autorService.closeEntityManager();
		return lista;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public Autor getAutor(){
		return autor;
	}
	

}
