package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    
}
