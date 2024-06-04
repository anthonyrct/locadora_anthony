package webapp.locadora_anthony.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webapp.locadora_anthony.Model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{
    
}
