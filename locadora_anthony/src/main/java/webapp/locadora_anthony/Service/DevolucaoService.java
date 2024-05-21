package webapp.locadora_anthony.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.locadora_anthony.Model.Devolucao;
import webapp.locadora_anthony.Repository.DevolucaoRepository;

@Service
public class DevolucaoService {
    @Autowired
    private DevolucaoRepository devolucaoRepository;

    public Devolucao save(Devolucao devolucao) {
        return devolucaoRepository.save(devolucao);
    }
}
