import java.util.Scanner;
public class Guess {
    public static void main(String[] args){
        int com = (int) (Math.random() * 101);
        Scanner p = new Scanner(System.in);
        boolean game = false;
        int player;
        int tries = 1;
        while(game == false){
            player = p.nextInt();
            if(player == com){
                game = true;
                if(tries > 7){
                    System.out.println("Wow it took you " + tries + " get better");
                }else{
                    System.out.println("You got it correct\nand it only took you " + tries + " tries");
                }
                p.close();
            }else{
                if(player > com){
                    System.out.println("too high");
                }else if(player < com){
                    System.out.println("too low");
                }
                tries++;
            }
        }
    }
}
