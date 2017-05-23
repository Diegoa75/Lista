package ar.edu.unlam.tallerweb1.controladores;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unlam.tallerweb1.modelo.Persona;

@Controller
public class Inicio {
	
@RequestMapping("/formulario")
	public ModelAndView formulario() {

	return new ModelAndView("formulario","command", new Persona());
		}


	  @RequestMapping(value="/agregar", method = RequestMethod.GET)
	    public ModelAndView agregar()
	    {
	        ArrayList<Persona> lista = new ArrayList<Persona>();
	        Persona persona1= new Persona("pedro");
	        Persona persona2=new Persona("maria");
	        lista.add(persona1);
	        lista.add(persona2);
	        return new ModelAndView("exito","command",lista);
	        }

	
	
}
