package br.com.dogplay.services;

import br.com.dogplay.Repository.ServiceRepository;
import br.com.dogplay.models.Prestador;
import br.com.dogplay.models.Servico;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServicoService {

    private final ServiceRepository servicosRepository;

    public ServicoService(ServiceRepository servicosRepository) {
        this.servicosRepository = servicosRepository;
    }

    public Servico save(Servico servico){
        return servicosRepository.save(servico);
    }

    public Servico findById(UUID id) {
        return servicosRepository.findById(id).orElse(null);
    }

    public void delete(UUID Id) {
        servicosRepository.deleteById(Id);
    }

    public List<Servico> findAll() {
        return servicosRepository.findAll();
    }

//    public Servicos update(Prestador prestador, String Id) {
//        var aux = findById(Id);
//        if (aux != null) {
//            if (prestador.getId() != null) {
//                aux.setId(servicos.getId());
//            }
//            if (prestador.getAdestrador() != null) {
//                aux.setAdestrador(prestador.getAdestrador());
//            }
//            return prestadorrepository.save((aux));
//        }
//        return null;
//    }


}