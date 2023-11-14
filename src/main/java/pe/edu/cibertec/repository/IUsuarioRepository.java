package pe.edu.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.cibertec.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
