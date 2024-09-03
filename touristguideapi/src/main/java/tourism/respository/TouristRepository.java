package tourism.respository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private final List<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository(){
        attractions.add(new TouristAttraction("Gade", "Smuk"));
        attractions.add(new TouristAttraction("Vej", "Gammel"));
    }

    //CRUD
    //Create
    public void addAttraction(TouristAttraction touristAttraction){
        attractions.add(touristAttraction);
    }
    //Read
    public List<TouristAttraction> findAll(){
        return attractions;
    }
    public TouristAttraction findByName(String name){
        for (TouristAttraction attraction : attractions){
            if (attraction.getName().equalsIgnoreCase(name)){
                return attraction;
            }
        }
        return null;
    }
    //Update
    public boolean updateAttraction(String name, TouristAttraction updatedAttraction) {
        for (int i = 0; i < attractions.size(); i++) {
            if (attractions.get(i).getName().equalsIgnoreCase(name)) {
                attractions.set(i, updatedAttraction);
                return true;
            }
        }
        return false;
    }
    //Delete
    public boolean deleteAttraction(String name) {
        return attractions.removeIf(attraction -> attraction.getName().equalsIgnoreCase(name));
    }
}
