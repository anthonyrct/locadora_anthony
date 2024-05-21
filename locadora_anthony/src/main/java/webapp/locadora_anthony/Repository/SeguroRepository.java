package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Seguro;

public interface SeguroRepository extends JpaRepository<Seguro, Long> {
    
}
