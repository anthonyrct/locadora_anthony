package webapp.locadora_anthony.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.locadora_anthony.Model.Seguro;
import webapp.locadora_anthony.Repository.SeguroRepository;

@Service
public class SeguroService {
    @Autowired
    private SeguroRepository seguroRepository;

    public Seguro save(Seguro seguro) {
        return seguroRepository.save(seguro);
    }
}
