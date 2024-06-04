package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Manutencao;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Integer> {
    
}
