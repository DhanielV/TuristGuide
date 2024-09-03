package tourism.service;

import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.respository.TouristRepository;

import java.util.List;

@Service
public class TouristService {
    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    //CRUD
    //Create
    public void addAttraction(TouristAttraction touristAttraction) {
        touristRepository.addAttraction(touristAttraction);
    }

    //Read
    public List<TouristAttraction> findAll() {
        return touristRepository.findAll();
    }

    public TouristAttraction findByName(String name) {
        return touristRepository.findByName(name);
    }

    //Update
    public boolean updateAttraction(String name, TouristAttraction updatedAttraction) {
        return touristRepository.updateAttraction(name, updatedAttraction);
    }

    //Delete
    public boolean deleteAttraction(String name) {
        return touristRepository.deleteAttraction(name);
    }
}

