package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Agencia;

public interface AgenciaRepository extends JpaRepository<Agencia, Integer>{
    
}
