package products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import products.models.Category;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
