package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorOperacion {
	//http://localhost:8080/Proyecto-limpio-spring/operacion/mayuscula/esther y naty
	@RequestMapping (path= "/operacion/{operacion}/{cadena}", method=RequestMethod.GET)
	public ModelAndView operacionCadena(@PathVariable String operacion,
			@PathVariable String cadena) {
		switch (operacion) {
		case "mayuscula":
			ModelMap model= new ModelMap();
			String resultado= cadena.toUpperCase();
			model.put("resultado", resultado);
			return new ModelAndView("mayuscula", model);
			
		case "minuscula":
			ModelMap model1= new ModelMap();
			String resultado1= cadena.toLowerCase();
			model1.put("resultado", resultado1);
			return new ModelAndView("minuscula", model1);
		}
		String error= "Debe ingresar una operacion valida";
		ModelMap modelError= new ModelMap();
		modelError.put("msj", error);
		
		return new ModelAndView("error", modelError);
	}

}
