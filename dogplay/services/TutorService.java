package br.com.dogplay.services;

import br.com.dogplay.models.Tutor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TutorService {
@Autowired
    private TutorService tutorService;
    public Tutor saveTutor(Tutor tutor) {
        return tutor;
    }

    public List<Tutor> getAllTutors() {
        return null;
    }

    public Optional<Object> getTutorById(Long id) {
            return Optional.empty();
    }

    public Object deleteTutor(Long id) {
    return id;}


}