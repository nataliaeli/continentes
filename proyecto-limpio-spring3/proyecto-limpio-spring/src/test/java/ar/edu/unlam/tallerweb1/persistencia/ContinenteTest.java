package ar.edu.unlam.tallerweb1.persistencia;

import org.hibernate.criterion.Restrictions;
import java.util.List;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Pais;

import static org.assertj.core.api.Assertions.*;

public class ContinenteTest extends SpringTest{
	
	//1)Escribir las clases con las relaciones correspondientes	
		
	//2)Buscar todos los paises de habla inglesa
		
		@Test
		@Transactional
		@Rollback(true)
		public void buscarPaisesDeHablaInglesa(){
			
			Pais estadosUnidos=new Pais();
			estadosUnidos.setIdioma("ingles");
			getSession().save(estadosUnidos);
			
			Pais inglaterra=new Pais();
			inglaterra.setIdioma("ingles");
			getSession().save(inglaterra);
			
			Pais argentina=new Pais();
			argentina.setIdioma("castellano");
			getSession().save(argentina);
			
			List<Pais> listaPaises= getSession().createCriteria(Pais.class)
					                  .add(Restrictions.eq("idioma","ingles"))
									  .list();
			
			assertThat(listaPaises).hasSize(2);
		}


}
