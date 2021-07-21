package File.Items;

public class Bible implements Item {

    @Override
    public void ability() {
        System.out.println("This is a book of holy which can kill every ghost in the house.");

    }

    @Override
    public int getPowerAttack() {
        return 35;
    }

    @Override
    public String getNameOfItem() {
        return "bible";
    }

    @Override
    public String getDetailsOfItem() {
        return "This is a book of holy which can kill every ghost in the house.";
    }
}



