import java.util.Random;
import java.util.Scanner;

public class character {

    public static void clearScreen() {
        for(int i = 0; i<30;i++)
            System.out.println("\n");
    }

    Scanner sc1 = new Scanner(System.in);
    Random rnd=new Random();
    private String name;
    private int health;
    private int attack;
    private int xp;

    public character(){

    }

    public character(int health, int attack, int xp, String Name){
        this.health = health;
        this.attack = attack;
        this.xp = xp;
        this.name = Name;
    }

    public character(int health, int attack){
        this.health = health;
        this.attack = attack;
    }

    public void Stats(){
        System.out.println("HP: " + this.health);
        System.out.println("Attack: " + this.attack);
        if(this.xp !=-1) {
            System.out.println("XP: " + this.xp);
        }
    }

    public void healthDown(int damage){
        this.health -= damage;
    }

    public void xpUp(int value){
        this.xp += value;
    }

    public void setData(int health, int attack, int xp){
        this.health = health;
        this.attack = attack;
        this.xp = xp;
    }

    public void runAway(){
        int x = rnd.nextInt(11);

        if(x == 1) {
            healthDown(20);
            System.out.println("You weren't fast enough, the enemy managed to hit you!");
        }
        else
            System.out.println("You managed to slip by the enemy!");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void death(){
        System.out.println("You died.");
        sc1.next();
        System.exit(0);

    }

    public void encounterStats(character player, character enemy){
        System.out.println("Your stats: ");
        player.Stats();
        System.out.println("\nThe enemies stats: ");
        enemy.Stats();
    }

    public void setAttack(int value)
    {
        this.attack = value;
    }

    public void encounter(character player, character enemy){
        boolean x = true;
        System.out.println("You're fighting " + enemy.name + "!\n\n");
        //encounterStats(player, enemy);

        while(x) {
            //clearScreen();
            encounterStats(player, enemy);
            System.out.println("\n\n\nPress 1 to attack " + enemy.name + " or press 2 to attempt an escape (10% chance of getting hit with 20 damage while also getting no XP!)");
            int optiune = sc1.nextInt();

            if (optiune == 1) {
                enemy.healthDown(player.attack);
                System.out.println("You hit " + enemy.name + " dealing " + player.attack + " damage!");
            }
            else if(optiune == 2)
            {
                runAway();
                x=false;
                break;

            }
            else
                System.out.println("That's not possible, please press one of the two buttons.");

            if(enemy.health < 1) {
                System.out.println("You have defeated " + enemy.name + "! You continue your journey through the Dungeon.");
                player.xpUp(1);
                x = false;
            }
            else if(enemy.health > 0)
            {
                player.healthDown(enemy.attack);
                System.out.println("Oh no, " + enemy.name + " hit you, dealing " + enemy.attack + " damage. Your health is now " + player.health);
            }

            if(player.health <1)
            {
                player.death();
                x=false;
            }

        }
    }

    public void bossBattle(character player, character boss){
        System.out.println("This is it!\nYou're fighting the legendary boss!\n" + boss.name + "!\nYou can't run anymore!\n");
        //encounterStats(player, boss);

        boolean x = true;

        while(x) {
            //clearScreen();
            encounterStats(player, boss);
            System.out.println("\n\n\nPress 1 to attack " + boss.name + ".");
            int optiune = sc1.nextInt();
            if(optiune !=1)
            {
                System.out.println("You cannot run or do anything else, attack!");
            }
            else
            {
                boss.healthDown(player.attack);
                System.out.println("You hit " + boss.name + " dealing " + player.attack + " damage!");
            }

            if(boss.health < 1) {
                System.out.println("You have defeated " + boss.name + "! You continue your journey through the Dungeon... next update after the dev learns more java...");
                x = false;
                player.xpUp(5);
            }
            else if(boss.health > 0)
            {
                player.healthDown(boss.attack);
                System.out.println("Oh no, " + boss.name + " hit you, dealing " + boss.attack + " damage. Your health is now " + player.health);
            }

            if(player.health <1)
            {
                player.death();
                x=false;
            }


        }

    }

}
