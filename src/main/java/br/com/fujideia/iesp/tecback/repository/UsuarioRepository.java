package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*  -SEGUNDO PASSO
no Repository manipular o banco  como add exluir etc..*/

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer > {

}
