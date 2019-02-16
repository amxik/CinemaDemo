package ua.org.amxik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.org.amxik.models.UserEntity;

/**
 * Created by Админ on 16.02.2019.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
