package pe.edu.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="roles")
@Getter
@Setter
@AllArgsConstructor //constructor con todos argumentos
@NoArgsConstructor //constructor vacío
public class Rol {
	@Id
	@Column(name="rol_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nombre")
	private String nombre;
}
