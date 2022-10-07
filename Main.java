import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> heroes = new ArrayList<String>();

        Hero<String> firstHero = new Hero<String>();
        firstHero.setheroName("Invoker");
        firstHero.setheroVoiceline("I guess there's more to it than I thought. Maybe I shoulda read the whole thing before starting");
        firstHero.setheroOrigin("Radiant");
        heroes.add("\"" + firstHero.getheroName() + "\"" + " I am " + firstHero.getheroVoiceline() + " And I came from "
                + firstHero.getheroOrigin());

        Hero<String> secondHero = new Hero<String>();
        secondHero.setheroName("Phantom Assassin");
        secondHero.setheroVoiceline(" I always find my target.");
        secondHero.setheroOrigin("Dire");
        heroes.add("\"" + secondHero.getheroName() + "\"" + " I am " + secondHero.getheroVoiceline() + " And I came from "
                + secondHero.getheroOrigin());

        Hero<String> thirdHero = new Hero<String>();
        thirdHero.setheroName("Earth Spirit");
        thirdHero.setheroVoiceline("My spirit accretes from a higher plane.");
        thirdHero.setheroOrigin("Radiant");
        heroes.add("\"" + thirdHero.getheroName() + "\"" + " I am " + thirdHero.getheroVoiceline() + " And I came from "
                + thirdHero.getheroOrigin());

        Hero<String> fourthHero = new Hero<String>();
        fourthHero.setheroName("Meepo");
        fourthHero.setheroVoiceline("Ain't nothing gonna stop me now!");
        fourthHero.setheroOrigin("Dire");
        heroes.add("\"" + fourthHero.getheroName() + "\"" + " I am " + fourthHero.getheroVoiceline() + " And I came from "
                + fourthHero.getheroOrigin());

        Hero<String> fifthHero = new Hero<String>();
        fifthHero.setheroName("Omni Knight");
        fifthHero.setheroVoiceline("Omniknight. By virtue, by strength. By the Omniscience. My hammer is ready in the service of the All-knowing One.");
        fifthHero.setheroOrigin("Radiant");
        heroes.add("\"" + fifthHero.getheroName() + "\"" + " I am " + fifthHero.getheroVoiceline() + " And I came from "
                + fifthHero.getheroOrigin());

        System.out.print("     [0,1,2,3,4]");
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();

        try {
            if (input < 0) {
                sc.close();
                throw new HeroException("Your input is negative. Please input positive index.");
            }
            if (input > 5) {
                sc.close();
                throw new HeroException("Your input exceeds the size of the array.");
            }

            System.out.println("Index number: " + input);
            System.out.println(heroes.get(input));

        } catch (HeroException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}