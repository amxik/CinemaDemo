package ua.org.amxik.service.impl;

import org.springframework.stereotype.Service;
import ua.org.amxik.models.TicketEntity;
import ua.org.amxik.repositories.TicketRepository;
import ua.org.amxik.service.TicketService;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
@Service
public class TicketServiceImpl implements TicketService{

    private TicketRepository ticketRepository;

    @Override
    public TicketEntity addTicket(TicketEntity ticket) {
        return ticketRepository.saveAndFlush(ticket);
    }

    @Override
    public void delete(long id) {
            ticketRepository.deleteById(id);
    }

    @Override
    public TicketEntity getById(long id) {
        return ticketRepository.getOne(id);
    }

    @Override
    public TicketEntity editTicket(TicketEntity ticket) {
        return ticketRepository.saveAndFlush(ticket);
    }

    @Override
    public List<TicketEntity> getAll() {
        return ticketRepository.findAll();
    }
}
