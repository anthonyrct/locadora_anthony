package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Funcionarios;

public interface FuncionarioRepository extends JpaRepository<Funcionarios, Integer>{
    
}
