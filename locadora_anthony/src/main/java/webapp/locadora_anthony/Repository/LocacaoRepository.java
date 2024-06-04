package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.locacao;

public interface LocacaoRepository extends JpaRepository<locacao, Integer>{
    
}
