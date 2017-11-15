public class DogShelter extends AnimalShelter<Dog> {

    @Override
    Dog adoptAnimal(){
        return (Dog) super.adoptAnimal();
    }

    void putAnimal(Dog dog){
        super.putAnimal(dog);
    }
}
