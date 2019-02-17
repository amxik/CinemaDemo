package ua.org.amxik.service.impl;

import org.springframework.stereotype.Service;
import ua.org.amxik.models.HallEntity;
import ua.org.amxik.repositories.HallRepository;
import ua.org.amxik.service.HallService;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
@Service
public class HallServiceImpl implements HallService {

    private HallRepository hallRepository;

    @Override
    public HallEntity addHall(HallEntity hall) {
        return hallRepository.saveAndFlush(hall);
    }

    @Override
    public void delete(long id) {
        hallRepository.deleteById(id);
    }

    @Override
    public HallEntity getById(long id) {
        return hallRepository.getOne(id);
    }

    @Override
    public HallEntity editHall(HallEntity hall) {
        return hallRepository.saveAndFlush(hall);
    }

    @Override
    public List<HallEntity> getAll() {
        return hallRepository.findAll();
    }
}
