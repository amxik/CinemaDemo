package ua.org.amxik.models;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by Админ on 16.02.2019.
 */
@Entity
@Table(name = "movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private int duration;

    @OneToMany(mappedBy = "movie")
    private Set<SeanceEntity> seances;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Set<SeanceEntity> getSeances() {
        return seances;
    }

    public void setSeances(Set<SeanceEntity> seances) {
        this.seances = seances;
    }


}
