package sw2.clase05ej1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sw2.clase05ej1.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

