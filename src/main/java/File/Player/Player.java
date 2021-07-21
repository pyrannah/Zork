package File.Player;

import File.Items.Item;
import File.Monsters.Monster;

import java.util.ArrayList;
import java.util.List;

public class Player {

    boolean alive;
    public int hp;
    public static final int MAX_HP = 300;
    public int attackPower;
    public Item item;
    public List<Item> inventory;
    public int level;
    public String monsterCurrentFacing;

    public Player() {
        alive = true;
        hp = MAX_HP;
        attackPower = 20; // starter level (level 1)
        inventory = new ArrayList();
        this.level = 1;
        inventory = new ArrayList<>();

    }


    public void increaseHP (int hpInput) {// when they get an item that can heal the HP and when you reach the HP_MAX your level will increase!!
        if (hp + hpInput >= MAX_HP) {
            hp = MAX_HP;
            level++;// increase level
            attackPower= attackPower+ 5; // when the player complete each level it will upgrade the power attack by 5
        }
        else {
            hp += hpInput;
        }
    }

    public void decreaseHealth(int attack) {
        hp -= attack;
        if (hp <= 0) {
            hp = 0;
            alive = false;
        }
    }

    public int getHP_MAX(){
        return MAX_HP;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public static int getMaxHp() {
        return MAX_HP;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(Item item) {
        inventory.add(item);
    }

    public Item getItem(String nameOfItem){
        Item answer = null;

        for (Item i : inventory){
            if (nameOfItem.equals(i.getNameOfItem())){

                answer = i;
                this.item = item;

            }
            else {
                System.out.println("There is no such an Item");
            }
        }
return answer;
    }
    public void pickUpItem(Item item){

        inventory.add(item);
    }

    public void getStatusOfPlayer(){
        System.out.println("Player status::::::");
        System.out.println("HP :" + getMaxHp());
        System.out.println("Attack power :" + getAttackPower());
        if (inventory.isEmpty()){
            System.out.println("Inventory: Your inventory is empty!! ");
        }
        else {
            for (Item i: inventory){
                System.out.println(i.getNameOfItem()+":"+ i.getDetailsOfItem());
            }
        }
    }

    public void getItemInCurrentInInventory(){
        for (Item j : inventory){// for current inventory

            System.out.println(j.getNameOfItem());
        }
    }

        public void attack(Monster monster) {

            monsterCurrentFacing = monster.getName();
            int totalAttackPower = this.item.getPowerAttack();
            int levelOfPlayer = this.level;

        if (item instanceof Item) {

            if (monster.getLevel()>levelOfPlayer){
                monster.increaseHp(this.hp);
                this.decreaseHealth(totalAttackPower);
                System.out.println("Player attacks: Monster name:"+ monster.getName()+ " HP" + totalAttackPower +
                        "but your level can't reach the level standard so it causes you to lose you HP : Player current HP:"+ hp );
                System.out.println("The monster increases the HP level :" + monster.getHP());

                if (!this.alive) { // refers to player
                    System.out.println("GAME OVER");
                    System.exit(0);

            }else {
                monster.decreaseHp(totalAttackPower);
                System.out.println("Player attacks: Monster name:"+ monster.getName()+ "successfully!!" +
                        "with the power attack :"+ totalAttackPower);

                    if (!this.alive) { // refers to player
                        System.out.println("GAME OVER");
                        System.exit(0);

            }else if (!(monster.equals(alive))){

                        System.out.println(monster.completeTask());
                    }
                }
            }
        }
    }
}
