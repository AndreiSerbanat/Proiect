import java.util.Scanner;

public class NewGame {

    public static void clearScreen() {
        for(int i = 0; i<30;i++)
            System.out.println("\n");
    }

    character Player = new character(100, 1, 0, "John Doe");
    character p = new character();

    character Robert = new character(50,10,-1, "Robert");
    character George = new character(50,10,-1, "George");
    character Cristopher = new character(50,10,-1, "Christopher");
    character Geralt = new character(50,10,-1, "Geralt");
    character Bob = new character(50,10,-1, "Bob");
    character Gary = new character(50,10,-1, "Gary");

    character Boss = new character(50, 20, -1, "Bartholomew");

    Scanner sc = new Scanner(System.in);
    Weapons w = new Weapons();

    public NewGame(){

        //System.out.println("Introduction");
    }

    public void start(){
        w.storyStart();
        clearScreen();

        w.listing();
        int n;
        boolean ok = true;

        while(ok) {
            n = sc.nextInt();
            if (n == 5) {
                w.descriptions();
            } else if (n == 1) {
                System.out.println("Yeah, you're not Guts... You struggle to lift the sword for a while and give up, your attack is now 1.\nYou cannot touch the rest of the weapons anymore, so you move to the next chamber.");
                ok = false;
                Player.setAttack(1);
            } else if (n == 2) {
                System.out.println("Yeah, you're not a wizard... You don't feel anything as you lift it, but at least it has a pointy end...\nYour attack is now 5.\nYou cannot touch the rest of the weapons anymore, so you move to the next chamber.");
                ok = false;
                Player.setAttack(5);
            }  else if (n == 3) {
                System.out.println("Yeah, you're not worthy... You struggle to lift the sword for a while and give up, your attack is now 1\nYou cannot touch the rest of the weapons anymore, so you move to the next chamber.");
                ok = false;
                Player.setAttack(1);
            }else if (n == 4) {
                System.out.println("You pick up the sword and weigh it. It feels good in your hand.\nYour attack is now 25.\nYou cannot touch the rest of the weapons anymore, so you move to the next chamber.");
                ok = false;
                Player.setAttack(25);
            }else{
                System.out.println("That's not possible, press one of the possible choices!");
            }

        }
        //clearScreen();
    }

    public void game(){
        System.out.println("\n\nYou enter the first chamber and see an ugly orc approaching you!\n It looks dangerous and could probably kill a  normal man in one hit. It wants to fight.");
        p.encounter(Player, Robert);
        System.out.println("\n\nYou continue the journey and find a darker room lit by a few torches!\nYou stumble your way through the room and hear something behind you. A troll lloks at you. It wants to fight.");
        p.encounter(Player, George);
        System.out.println("\n\nYou keep going and see another orc approaching you!\nIt wants to fight.");
        p.encounter(Player, Cristopher);
        System.out.println("\n\nYou keep going and see another troll approaching you!\nWhat a surprise... It wants to fight...");
        p.encounter(Player, Geralt);
        System.out.println("\n\nYou keep going and meet Bob, he's Robert's younger brother so he wants kill you.");
        p.encounter(Player, Bob);
        System.out.println("\n\nYou keep going and see Gary. He doesn't want to fight but he's contractually obligated.");
        p.encounter(Player, Gary);


        p.bossBattle(Player, Boss);


    }



    public void name()
    {
        System.out.println("What is your name, adventurer?\nNAME: ");
        String name = sc.next();
        Player.setName(name);
        System.out.println("\nThis is your adventure, " + name + "! Good luck!");
    }

}
