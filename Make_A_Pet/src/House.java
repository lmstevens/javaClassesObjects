import java.util.Scanner;

public class House {
    private int roomNumber;
    private boolean backyard;
    private boolean basement;
    private int cost;
    private int bathNumber;

    public House() {

    }

    public House(boolean backyard, boolean basement) {
        this.backyard = backyard;
        this.basement = basement;
    }

    public House(int roomNumber, int cost, int bathNumber) {
        this.roomNumber = roomNumber;
        this.cost = cost;
        this.bathNumber = bathNumber;

    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean getBackyard() {
        return this.backyard;
    }

    public void setBackyard(boolean backyard) {
        this.backyard = backyard;
    }

    public boolean getBasement() {
        return this.basement;
    }

    public void setBasement(boolean basement) {
        this.basement = basement;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getBathNumber() {
        return this.bathNumber;
    }

    public void setBathNumber(int bathNumber) {
        this.bathNumber = bathNumber;
    }

    public boolean perfectHouse() {
        // Scanner input = new Scanner(System.in);
        if (getBasement() && getBackyard()) {
            System.out.println("It's a perfect house!");
            return true;
        } else {
            return false;
        }

    }

    public String houseSummary() {
        return "Our house house has" + getBathNumber() + "bathrooms and " + getRoomNumber() + ".";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String myPetName = input.nextLine();

        House dreamHome = new House(23,58,34);
        dreamHome.setBackyard(true);
        dreamHome.setBasement(true);

        dreamHome.houseSummary();
        dreamHome.perfectHouse();
    }


}       

