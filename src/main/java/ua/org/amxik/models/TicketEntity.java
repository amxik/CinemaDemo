package ua.org.amxik.models;

import javax.persistence.*;

/**
 * Created by Админ on 16.02.2019.
 */

@Entity
@Table(name = "ticket")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int row;
    private int place;


    @ManyToOne()
    @JoinColumn(name = "usr_id")
    private UserEntity usr;

    @ManyToOne()
    @JoinColumn(name = "seance_id")
    private SeanceEntity seance;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public UserEntity getUsr() {
        return usr;
    }

    public void setUsr(UserEntity user) {
        this.usr = usr;
    }

    public SeanceEntity getSeance() {
        return seance;
    }

    public void setSeance(SeanceEntity seance) {
        this.seance = seance;
    }


}
