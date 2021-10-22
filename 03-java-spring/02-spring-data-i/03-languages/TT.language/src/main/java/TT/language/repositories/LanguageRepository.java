package TT.language.repositories;
import TT.language.models.Language;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	
	List<Language> findAll();

}
