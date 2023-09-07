package br.com.fujideia.iesp.tecback.repository;


import br.com.fujideia.iesp.tecback.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* -SEGUNDO PASSO
Repository: Responsavel pela comunicacao com os dados que o service precisa como ADD,excluir etc...*/

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
