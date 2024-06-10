package webapp.locadora_anthony.Repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Carro;

public interface CarroRepository extends JpaRepository<Carro, interger> {
    List <Carro> findByDisponibilidadeTrue();
}
