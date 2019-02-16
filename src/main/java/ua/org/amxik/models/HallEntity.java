package ua.org.amxik.models;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Админ on 16.02.2019.
 */

@Entity
@Table(name = "hall")
public class HallEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private int rowCount;
    private int placeCount;


    @OneToMany(mappedBy = "hall")
    private Set<SeanceEntity> seances;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getPlaceCount() {
        return placeCount;
    }

    public void setPlaceCount(int placeCount) {
        this.placeCount = placeCount;
    }

    public Set<SeanceEntity> getSeances() {
        return seances;
    }

    public void setSeances(Set<SeanceEntity> seances) {
        this.seances = seances;
    }


}
