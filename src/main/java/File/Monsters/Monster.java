package File.Monsters;

import File.Player.Player;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Monster {

    private String name;
    private int HP;
    private boolean alive;
    private int attack;
    private int HP_MAX = 200;
    private int level;
    private boolean taskComplete = false;
    private String detailsOfMonster;



    Monster(String name, int hp, int attack, int level, String detailsOfMonster) {
        this.name = name;
        this.HP = hp;
        this.attack = attack;
        this.level = level;
        this.detailsOfMonster = detailsOfMonster;
    }
public String getDetailsOfMonster(){
        return detailsOfMonster;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP_MAX() {
        return HP_MAX;
    }

    public void setHP_MAX(int HP_MAX) {
        this.HP_MAX = HP_MAX;
    }

    public void increaseHp(int attack) {// when player can't reach the requirement level
        if (Math.abs(HP + attack) < HP_MAX) {
            this.HP += attack;
        } else {

            this.HP = HP_MAX;

        }
    }

    public void decreaseHp(int attack) {
        this.HP -= attack;
        if (this.HP <= 0) {
            this.alive = false;

        }

    }

    public void attack(Player player) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10);// set to random attack action for monster
        if (randomNum < this.attack) { // if the number comes out less than the current attack
             player.decreaseHealth(this.attack);
            System.out.println("Monster attacks: Player -" + this.attack + " HP of the player :"+ player.hp);
        } else {
            System.out.println("Monster misses.");
        }

    }
    public String completeTask(){
        taskComplete = true;
        return "You beat them!! congratulations and let's continue the game";
    }
}
