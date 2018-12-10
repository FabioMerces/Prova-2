package managedbeans.converter;



import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import Entidades.Autor;
import service.AutorService;



@FacesConverter("converterAutor")
public class AutorConverter implements Converter {

	private AutorService servico = new AutorService();
	
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
		
		Autor f=null;
		if(value != null && !value.equals("")) {
			f = servico.getAutorByCPF(value);	
		}
		
		servico.closeEntityManager();
		
		return f;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic,
			Object autor) {
		if (autor == null || autor.equals("")) {
			return null;
		} else {
			return ((Autor) autor).getCPF();

		}
	}

}
