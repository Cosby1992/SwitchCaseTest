import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {



        boolean quitkey = false;

        while (quitkey==false) {

            String switchKey;

            Scanner scan = new Scanner(System.in);

            System.out.println("Input case number for switch: (1-5). Case 5 quits the while loop");
            switchKey = scan.nextLine();

            switch (switchKey) {
                case "1":
                    System.out.println("You chose case 1 :)");
                    break;
                case "2":
                    System.out.println("you chose case 2 :)");
                    break;
                case "3":
                    System.out.println("You chose case 3 :)");
                    break;
                case "4":
                    System.out.println("you chose case 4 :)");
                    break;
                case "5":
                    quitkey = true;
                    break;
                default:
                    System.out.println("You didn't chose an option between 1 and 5 you moron");

            }
        }


    }
}
