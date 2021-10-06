import java.util.Scanner;

public class Weapons {

    public static void clearScreen() {
        for(int i = 0; i<30;i++)
            System.out.println("\n");
    }

    Scanner sc2 = new Scanner(System.in);

    public Weapons(){

    }

    public void listing(){
        System.out.println("You walk into the room and see four weapons lying on 4 tables, each with a name etched in the table.\n\nYou hear the wizard's voice echo in the chamber:\n\"Choose a weapon carefully, it will decide your fate!\"\n\n\n(By pressing 5 you can see a description of the weapons)\n\n\n\n1.The Dragon Slayer\n2.The Elder Wand\n3.Mjolnir\n4.A Regular Steel Sword");
    }

    public void descriptions(){
        System.out.println("THE DRAGON SLAYER - \"It was too big to be called a sword. Massive, thick, heavy, and far too rough. Indeed, it was a heap of raw iron.\"\n");
        System.out.println("THE ELDER WAND - \"It was said to have been the most powerful wand that had ever existed, able to perform feats of magic that would normally be impossible even for the most skilled wizards, such as mending\n another wand damaged beyond normal magical repair.\"\n");
        System.out.println("MJOLNIR - \"The enchanted hammer wielded by the Asgardian; Thor, the \"Norse God of Thunder\". The Uru hammer which grants him many of his powers and abilities. Forged by Eitri and the Dwarves of Nidavellir\n in the heart of a dying star. Mjolnir is enchanted so it can only be wielded by those who are deemed \"worthy\".\"\n");
        System.out.println("A REGULAR STEEL SWORD - \"Yeah, uhm... it's a regular sword, not much to say about it.\"");
    }

    public void storyStart(){
        System.out.println("You enter the dungeon despite all the warnings you got from the villagers.\nThe quest giver requested to leave your equipment before entering the dungeon.\n\n" +
                "You usually wouldn't do this, but the man was very strict about the quest demands and you were confident in your strength and skills even as a beginner. \n\n\n" +
                "\n\n\n" +
                "Do you leave your equipment at the dungeon's door, or disobey the quest?\nPress 1 to Leave your equipment.\nPress 2 to Take the equipment with you.\n");

        int x = sc2.nextInt();

        if(x==1)
        {
            System.out.println("You left your equipment, you hope you made the right decision...");
            System.out.println("Entering the chamber you see an old wizard wearing a robe and leaning on his staff\n" + "\"So you're the new challenger? Good, you carry no equipment, you passed the first test\"\n\"Trust in your abilities and make wise decisions. Good luck!\"\n\nYou move to the next chamber.");
        }
        else if(x==2)
        {
            System.out.println("You took the equipment with you, you hope you made the right decision...\nEntering the chamber you see an old wizard wearing a robe and leaning on his staff\n");

            System.out.println("\"So, you're the new challenger? Shame, I would've loved to see some action first, but it seems you already lost. Next time follow the rules!\"\n\n" +
                    "The last thing you see is the Wizard moving his staff. It lighted up and you felt a very strong and sharp pain.\n");

            System.out.println("You died.");
            sc2.next();
            System.exit(0);

        }
    }

    public void about(){
        System.out.println("A short text only game made in the span of 48 hours with very basic java knowledge. Creator: Andrei S");
    }

    public void tutorial(){
        System.out.println("The main mechenic of the game will be pressing 1 or 2. Think if it's worth fighting or running, and good luck!");
    }

}
