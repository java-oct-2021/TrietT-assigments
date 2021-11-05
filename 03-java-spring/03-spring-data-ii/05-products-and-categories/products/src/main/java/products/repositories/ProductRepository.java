package products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import products.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
