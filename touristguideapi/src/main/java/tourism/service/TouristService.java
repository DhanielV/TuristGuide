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
    public TouristAttraction addAttraction(TouristAttraction touristAttraction) {
        return touristRepository.addAttraction(touristAttraction);
    }

    //Read
    public List<TouristAttraction> findAll() {
        return touristRepository.findAll();
    }

    public TouristAttraction findByName(String name) {
        return touristRepository.findByName(name);
    }


    //Update
    public TouristAttraction updateAttraction(String name, TouristAttraction updatedAttraction) {
        return touristRepository.updateAttraction(name, updatedAttraction);
    }

    //Delete
    public TouristAttraction deleteAttraction(String name) {
        return touristRepository.deleteAttraction(name);
    }
}

