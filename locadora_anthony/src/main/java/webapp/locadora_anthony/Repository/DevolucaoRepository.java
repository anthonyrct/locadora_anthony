package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Devolucao;

public interface DevolucaoRepository extends JpaRepository<Devolucao, Long> {
    
}

