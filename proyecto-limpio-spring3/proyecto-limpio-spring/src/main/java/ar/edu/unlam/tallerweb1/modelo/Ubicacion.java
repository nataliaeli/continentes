package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ubicacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private Long id;
		private Integer latitud;
		private Integer longitud;
		
		@OneToOne
		private Continente continente;
		
		@OneToOne
		private Ciudad ciudad;
		
		//getters y setters

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getLatitud() {
			return latitud;
		}

		public void setLatitud(Integer latitud) {
			this.latitud = latitud;
		}

		public Integer getLongitud() {
			return longitud;
		}

		public void setLongitud(Integer longitud) {
			this.longitud = longitud;
		}

		public Continente getContinente() {
			return continente;
		}

		public void setContinente(Continente continente) {
			this.continente = continente;
		}
		
		public Ciudad getCiudad() {
			return ciudad;
		}

		public void setCiudad(Ciudad ciudad) {
			this.ciudad = ciudad;
		}	
		
}
