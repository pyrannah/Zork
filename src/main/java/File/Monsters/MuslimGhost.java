package File.Monsters;

public class MuslimGhost extends Monster implements Monsterl{

    MuslimGhost(){
        super("muslimghost",250, 25,1,"This is the scariest ghost ever that can brainwash people with the bad logic and unbelievable common sense");
    }
    @Override
    public int getPowerAttack() {
        return 20;
    }

    @Override
    public String getNameOfIMonster() {
        return "Ai khan";
    }

    @Override
    public String getDetailsOfMonster() {
        return "This is the scariest ghost ever that can brainwash people with the bad logic and unbelievable common sense";
    }
}
