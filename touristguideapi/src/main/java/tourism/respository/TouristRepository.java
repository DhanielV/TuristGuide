package tourism.respository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private final List<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository(){
        populateAttractions();
    }

    public void populateAttractions(){
        attractions.add(new TouristAttraction("Venice", "Venice faces a tourist crisis with overcrowding,cruises environmental damage, and rising living costs, threatening the city’s heritage and driving locals away."));
        attractions.add(new TouristAttraction("Barcelona", "Barcelona is experiencing a tourist crisis with overcrowding, rising living costs, and strain on local infrastructure, disrupting daily life and fueling anti-tourism sentiments among residents."));

    }

    //CRUD
    //Create
    public TouristAttraction addAttraction(TouristAttraction touristAttraction){

        attractions.add(touristAttraction);
        return touristAttraction;
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
    public TouristAttraction updateAttraction(String name, TouristAttraction updatedAttraction) {
        for (int i = 0; i < attractions.size(); i++) {
            if (attractions.get(i).getName().equalsIgnoreCase(name)) {
                attractions.set(i, updatedAttraction);
                return updatedAttraction;

            }
        }
        return null;
    }
    //Delete
    public TouristAttraction deleteAttraction(String name) {
        TouristAttraction attractionToDelete = findByName(name);
            if (attractionToDelete != null){
                attractions.remove(attractionToDelete);
                return attractionToDelete;
            }



        return null;
    }
}
