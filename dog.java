public class Dog {
    String name;
    boolean isMale;
    int numberOfPuppies;
    String[]listOfPuppies;
    
        public void setName(String thisname) {
            name= thisname
        }
    
        public String showName() {
            return name;
        }
    
        public static void bark() {
            System.out.println("Woof! Woof!");
        }

        
        public void setNumbersOfPuppies(int numOfPuppies) {
            NumberOfPuppies = numOfPuppies;
        }
        public void showNameOfPuppies(this){
            return this .numberOfPuppies;
        }
    
        public int setNumberOfPuppies(this, puppies) {
            this.puppies = puppies;
        }
    
        public void addPuppy(Dog clark) {
            puppies.add(clark);
            numberOfPuppies++;
        }
    
        public void showPuppies() {
            System.out.println("Number of puppies: " + numberOfPuppies);
            for (Dog puppy :(3)) {
                System.out.println("Puppy Name: " + puppy.showName(Name: clark,cornic,coin));
            }
        }
    }