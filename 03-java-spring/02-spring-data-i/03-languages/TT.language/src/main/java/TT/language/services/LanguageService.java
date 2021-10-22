package TT.language.services;

import org.springframework.stereotype.Service;

import TT.language.models.Language;
import TT.language.repositories.LanguageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {
    public final LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    public Language createLanguage(Language b) {
        return languageRepository.save(b);
    }

    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }

    public Language updateLanguage(Long id, String name, String creator, Integer currentVersion) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            Language language = optionalLanguage.get();
            language.setName(name);
            language.setCreator(creator);
            language.setCurrentVersion(currentVersion);
            languageRepository.save(language);
            return language;
        }
        else {
            return null;
        }
    }
    public void deleteLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            languageRepository.deleteById(id);
        }
    }

}