package ua.org.amxik.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Created by Админ on 16.02.2019.
 */

@Entity
@Table(name="seance")
public class SeanceEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Date seanceDate;
    private int priceTicket;


    @ManyToOne()
    @JoinColumn(name = "hall_id")
    private HallEntity hall;

    @ManyToOne()
    @JoinColumn(name = "movie_id")
    private MovieEntity movie;


    @OneToMany(mappedBy = "seance")
    private Set<TicketEntity> tickets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSeanceDate() {
        return seanceDate;
    }

    public void setSeanceDate(Date seanceDate) {
        this.seanceDate = seanceDate;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }

    public HallEntity getHall() {
        return hall;
    }

    public void setHall(HallEntity hall) {
        this.hall = hall;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public Set<TicketEntity> getTickets() {
        return tickets;
    }

    public void setTickets(Set<TicketEntity> tickets) {
        this.tickets = tickets;
    }


}
