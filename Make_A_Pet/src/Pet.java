import java.util.Scanner;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String typeOfPet;
    

    public Pet() {

    }

    public Pet() {

    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // pubic String getTypeOfPet(){
    //     return this.typeOfPet;
    // }

    public void setLocation(String location) {
        this.location = location;
    }

    // constructor with arguments 
    // public Pet(String name, int age, String location, String type) {
    //     this.name = name;
    //     this.age = age;
    //     this.location = location;
    //     this.type = type;
    // }

    // public String getName() {
    //     return this.name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public int getAge() {
    //     return this.age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public String getLocation() {
    //     return this.location;
    // }

    // public void setLocation(String location) {
    //     this.location = location;
    // }

    // public String getType() {
    //     return this.type;
    // }

    // public void setType(String type) {
    //     this.type = type;
    // }

    // public Pet name(String name) {
    //     this.name = name;
    //     return this;
    // }

    // public Pet age(int age) {
    //     this.age = age;
    //     return this;
    // }

    // public Pet location(String location) {
    //     this.location = location;
    //     return this;
    // }

    // public Pet type(String type) {
    //     this.type = type;
    //     return this;
    // }

    // // @Override
    // // public boolean equals(Object o) {
    // //     if (o == this)
    // //         return true;
    // //     if (!(o instanceof Pet)) {
    // //         return false;
    // //     }
    // //     Pet pet = (Pet) o;
    // //     return Objects.equals(name, pet.name) && age == pet.age && Objects.equals(location, pet.location) && Objects.equals(type, pet.type);
    // // }

    // // @Override
    // // public int hashCode() {
    // //     return Objects.hash(name, age, location, type);
    // // }

    // // @Override
    // // public String toString() {
    // //     return "{" +
    // //         " name='" + getName() + "'" +
    // //         ", age='" + getAge() + "'" +
    // //         ", location='" + getLocation() + "'" +
    // //         ", type='" + getType() + "'" +
    // //         "}";
    // // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String myPetName = input.nextLine();

        Pet myPet = new Pet();

        String myPetName = myPet.getName();
        System.out.println(myPetName);

        myPet.setName("Friday");

        String myNewPetName = myPet.getName();
        System.out.println(myNewPetName);
    }    



    
}   
