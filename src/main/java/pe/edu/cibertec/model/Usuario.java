package pe.edu.cibertec.model;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	@Id
	@Column(name="usuario_id")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="password")
	private String password;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Rol> roles = new HashSet<>();

}
