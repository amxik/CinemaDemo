package ua.org.amxik.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.org.amxik.models.SeanceEntity;
import ua.org.amxik.repositories.SeanceRepository;
import ua.org.amxik.service.SeanceService;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
@Service
public class SeanceServiceImpl implements SeanceService {

    @Autowired
    private SeanceRepository seanceRepository;

    @Override
    public SeanceEntity addSeance(SeanceEntity seance) {
        SeanceEntity savedSeance = seanceRepository.saveAndFlush(seance);
        return savedSeance;
    }

    @Override
    public void delete(long id) {
            seanceRepository.deleteById(id);
    }

    @Override
    public SeanceEntity getById(long id) {
        return seanceRepository.getOne(id);
    }

    @Override
    public SeanceEntity editSeance(SeanceEntity seance) {
        return seanceRepository.saveAndFlush(seance);
    }

    @Override
    public List<SeanceEntity> getAll() {
        return seanceRepository.findAll();
    }
}
