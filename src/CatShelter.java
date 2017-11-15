public class CatShelter extends AnimalShelter<Cat> {



    @Override
    Cat adoptAnimal(){
        return (Cat) super.adoptAnimal();
    }



    void putAnimal(Cat cat){
        super.putAnimal(cat);
    }
}
