package repository;

import com.vetproject.entity.Reptile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReptileRepository extends JpaRepository <Reptile, Long> {

}
