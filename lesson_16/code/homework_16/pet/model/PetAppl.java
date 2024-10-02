package homework_16.pet.model;

public class PetAppl {
    public static void main(String[] args) {

        Pet pet1 = new Pet(1,"Tim", "Rassel",5, false);
        Pet pet2 = new Pet(2,"Tom","Sheperd", 3,true);
        Pet pet3 = new Pet(5,"Kleon","Siamese cat",7,false);
        pet1.walking();
        pet2.eats();
        pet3.playing();

    }//ende main
}//ende klass
