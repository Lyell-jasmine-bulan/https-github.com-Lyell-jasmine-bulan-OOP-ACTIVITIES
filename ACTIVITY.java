public class Activity {
    public class Activity {
        public static void main(String[] args) {
            Dog motherDog = new Dog();
            motherDog.setName("clark");
            motherDog.bark();
            
            Dog puppy1 = new Dog();
            puppy1.setName("coin");
            
            Dog puppy2 = new Dog();
            puppy2.setName("Luna");
    
            motherDog.addPuppy(puppy1);
            motherDog.addPuppy(puppy2);
    
            motherDog.showPuppies();
        }
    }