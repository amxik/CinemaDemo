package ua.org.amxik;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import ua.org.amxik.config.DataConfig;
import ua.org.amxik.models.MovieEntity;
import ua.org.amxik.repositories.MovieRepository;

/**
 * Created by Админ on 16.02.2019.
 */

@Configuration
@EnableAutoConfiguration
public class DemoApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);

        MovieRepository movieRepository = context.getBean(MovieRepository.class);

        MovieEntity entity = new MovieEntity();
        entity.setDescription("Мелодрама");
        entity.setDuration(98);
        entity.setTitle("Титаник");


        movieRepository.save(entity);


        movieRepository.getOne(1L);


    }
}
