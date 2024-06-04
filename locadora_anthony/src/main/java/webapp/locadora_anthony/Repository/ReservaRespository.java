package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Reserva;

public interface ReservaRespository  extends JpaRepository<Reserva, Long>{
    
}
