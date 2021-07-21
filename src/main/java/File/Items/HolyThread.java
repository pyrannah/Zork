package File.Items;

public class HolyThread implements Item {

    @Override
    public void ability() {
        System.out.println("The beautiful wrists to protect you from the ghost you can use it to scare them");
    }

    @Override
    public int getPowerAttack() {
        return 40;
    }

    @Override
    public String getNameOfItem() {
        return "holy thread";
    }

    @Override
    public String getDetailsOfItem() {
        return "The beautiful wrists to protect you from the ghost you can use it to scare them";
    }

}
