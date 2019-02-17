package ua.org.amxik.service;

import ua.org.amxik.models.SeanceEntity;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
public interface SeanceService {
    SeanceEntity addSeance(SeanceEntity seance);
    void delete(long id);
    SeanceEntity getById(long id);
    SeanceEntity editSeance(SeanceEntity seance);
    List<SeanceEntity> getAll();
}
