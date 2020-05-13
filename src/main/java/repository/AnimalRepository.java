package repository;

import com.vetproject.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository <Animal, Long> {

    // getAllAnimals
    // getAnimal(long animalId)
    // updateAnimal(Animal fish)
    // deleteAnimal(long animalId)
}
