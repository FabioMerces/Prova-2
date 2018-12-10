package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Obra;
import Entidades.Autor;
import service.AutorService;
import service.ObraService;

@ManagedBean
@SessionScoped
public class ObraMB {
	private Obra obra = new Obra();
	private ObraService obraService = new ObraService();
	private AutorService autorService = new AutorService();
	private Autor autor;	
	
	
	public List<Autor> getAutors(){
		List <Autor> list = autorService.getAll(Autor.class);
		autorService.closeEntityManager();
		return list;
	}	
	
	public Autor getAutor() {
		return autor;
	}	
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void salvar() {
		obra.setAutor(autor);
		obraService.save(obra);
		obraService.closeEntityManager();
		obra = new Obra();
		autor = null;
	}
	
	public List<Obra> getObras(){
		List <Obra> lista;
		lista = obraService.getAll(Obra.class);
		obraService.closeEntityManager();
		return lista;
	}
	
	public void setObra(Obra obra) {
		this.obra = obra;
	}
	
	public Obra getObra(){
		return obra;
	}

}
