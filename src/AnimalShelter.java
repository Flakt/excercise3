import java.util.ArrayList;
import java.util.List;

public class AnimalShelter <T> {

    private List<T> animalsInShelter = new ArrayList<>(20);

    T adoptAnimal(){
        return animalsInShelter.remove(0);
    }

    void putAnimal(T animal){animalsInShelter.add(animal);}

}
