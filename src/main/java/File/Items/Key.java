package File.Items;

public class Key implements Item {

    @Override
    public void ability() {
        System.out.println("This is the key to access all the doors !!");
    }
    @Override
    public int getPowerAttack() {
        return 0;
    }

    @Override
    public String getNameOfItem() {
        return "key";
    }

    @Override
    public String getDetailsOfItem() {
        return "This is the key to access all the doors !!";
    }


}
