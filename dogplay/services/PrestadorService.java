package br.com.dogplay.services;
import br.com.dogplay.Repository.PrestadorRepository;
import br.com.dogplay.models.Prestador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PrestadorService {

    private static Optional<Object> prestador;
    private PrestadorRepository prestadorrepository = null;

    public static Prestador savePrestador(Prestador prestador) {
    }

    public static List<Prestador> getAllPrestador() {
        return null;
    }

    public static Optional<Object> ById(Long id) {
        return prestador;
    }

    @Autowired
    public void setPrestadorrepository(PrestadorRepository prestadorrepository) {
        this.prestadorrepository = prestadorrepository;
    }

    public Prestador save(Prestador prestador) {
        return prestadorrepository.save(prestador);
    }

    public Prestador findById(String Id) {
        var aux = prestadorrepository.findById(Id);
        Prestador prestador = null;
        if (aux.isPresent()) {

        }
        return prestador;
    }

    public void delete(String Id) {
        prestadorrepository.deleteById(Id);
    }

    public Prestador update(Prestador prestador, String Id) {
        var aux = findById(Id);
        if (aux != null) {
            if (prestador.getId() != null) {
                aux.setId(prestador.getId());
            }
            if (prestador.getAdestrador() != null) {
                aux.setAdestrador(prestador.getAdestrador());
            }
            return prestadorrepository.save((aux));
        }
        return null;
    }

    public List<Prestador> findAll() {
        return prestadorrepository.findAll();
    }

}