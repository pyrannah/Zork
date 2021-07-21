package File.Items;

public class HolyWater implements Item{
    @Override
    public void ability() {
        System.out.println("The holy water has a very pure ability to heal up your HP and attack the ghost");

    }
    @Override
    public int getPowerAttack() {
        return 30;
    }

    @Override
    public String getNameOfItem() {
        return "holy water";
    }

    @Override
    public String getDetailsOfItem() {
        return "The holy water has a very pure ability to heal up your HP and attack the ghost";
    }

    public int healUpStatus(){
        return 20;

    }
}
