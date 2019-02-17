package ua.org.amxik.service;

import ua.org.amxik.models.HallEntity;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
public interface HallService {

    HallEntity addHall(HallEntity hall);
    void delete(long id);
    HallEntity getById(long id);
    HallEntity editHall(HallEntity hall);
    List<HallEntity> getAll();


}
