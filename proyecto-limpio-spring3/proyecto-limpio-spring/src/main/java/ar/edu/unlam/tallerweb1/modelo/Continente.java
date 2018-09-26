package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CONTINENTE")
public class Continente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name= "ID")
		private Long id;
	    @Column(name= "NOMBRE")
		private String nombre;
		
		//getters y setters
	    
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
