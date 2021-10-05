import java.util.Scanner;

public class main {


    public static void clearScreen() {
        for(int i = 0; i<30;i++)
            System.out.println("\n");
    }


    public static void main(String[] args) {
        NewGame NG= new NewGame();
        Weapons w = new Weapons();
        clearScreen();
        Scanner sc = new Scanner(System.in);

        boolean x =true;
        int option;
        while(x){
            System.out.println("THE GAME\n\n1.New Game\n2.About\n3.Tutorial\n4.Quit\n\nOption=");
            option=sc.nextInt();

            if(option == 1)
                x=false;
            else if(option == 2)
                w.about();
            else if(option ==3)
                w.tutorial();
            else if(option==4)
                System.exit(0);
            else
                System.out.println("Try again, maybe check the tutorial this time ;)");
        }

        clearScreen();
        NG.name();
        NG.start();
        NG.game();

        //clearScreen();

    }

}
