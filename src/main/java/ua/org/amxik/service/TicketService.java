package ua.org.amxik.service;

import ua.org.amxik.models.TicketEntity;

import java.util.List;

/**
 * Created by amxik on 17.02.2019.
 */
public interface TicketService {
    TicketEntity addTicket(TicketEntity ticket);
    void delete(long id);
    TicketEntity getById(long id);
    TicketEntity editTicket(TicketEntity ticket);
    List<TicketEntity> getAll();
}
