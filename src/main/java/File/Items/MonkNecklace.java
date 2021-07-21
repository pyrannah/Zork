package File.Items;

public class MonkNecklace implements Item{
    @Override
    public void ability() {
        System.out.println("This is the coolest thing to scare the ghost when you use this necklace you will get more HP and you can also attack the monster by this ");

    }
    @Override
    public int getPowerAttack() {
        return 25;
    }

    @Override
    public String getNameOfItem() {
        return "monk necklace";
    }

    @Override
    public String getDetailsOfItem() {
        return "This is the coolest thing to scare the ghost when you use this necklace you will get more HP and you can also attack the monster by this ";
    }
}
