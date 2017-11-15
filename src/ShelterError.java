public class ShelterError {

    public static void main(String[] args){
        CatShelter catShelter = new CatShelter();
        Cat badBoyRex = new Cat();

        catShelter.putAnimal(badBoyRex);
        System.out.println("Who let the dogs out?!?");
    }
}
