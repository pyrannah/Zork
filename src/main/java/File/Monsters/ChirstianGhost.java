package File.Monsters;

public class ChirstianGhost extends Monster implements Monsterl {

    ChirstianGhost() {
        super("christianghost", 200, 20, 2,"This is a christian Hamza who scare of Bible the most which you can attack them and hit them hard");
    }
    @Override
    public int getPowerAttack() {
        return 20;
    }

    @Override
    public String getNameOfIMonster() {
        return "Christianghost";
    }

    @Override
    public String getDetailsOfMonster() {
        return "This is a christian Hamza who scare of Bible the most which you can attack them and hit them hard";
    }


}
