package File.Items;

import File.Monsters.Monster;

public class OccultWood implements Item{

    @Override
    public void ability() {
        System.out.println("This is the wood stick that can kill the ghost immediately!! ");

    }

    @Override
    public int getPowerAttack() {
        return 500;
    }

    @Override
    public String getNameOfItem() {
        return "occult wood";
    }

    @Override
    public String getDetailsOfItem() {
        return "This is the wood stick that can kill the ghost immediately!! ";
    }
}
