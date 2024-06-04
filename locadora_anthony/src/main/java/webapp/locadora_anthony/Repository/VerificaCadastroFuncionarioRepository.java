package webapp.locadora_anthony.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.locadora_anthony.Model.VerificaCadastroFuncionario;

public interface VerificaCadastroFuncionarioRepository extends CrudRepository<VerificaCadastroFuncionarioRepository, String>{
  VerificaCadastroFuncionario findBynome (String nome);
}
