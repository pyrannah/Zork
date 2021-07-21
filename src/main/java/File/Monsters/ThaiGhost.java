package File.Monsters;

public class ThaiGhost extends Monster implements Monsterl {

    ThaiGhost(){

        super("thaighost",200,20,2,"This Thai ghost who scare of everything, you can attack them!!!");
    }

    @Override
    public int getPowerAttack() {
        return 20;
    }

    @Override
    public String getNameOfIMonster() {
        return "Thai ghost name Somsak";
    }

    @Override
    public String getDetailsOfMonster() {
        return "This Thai ghost who scare of everything, you can attack them!!!";
    }

}
