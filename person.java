public class person {
    protected String name;
    protected String address;

    public person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String Address){
        this.address = Address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
}
