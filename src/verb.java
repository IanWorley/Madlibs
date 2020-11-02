import java.util.Scanner;

public class verb extends phrase {
public boolean wantsING;

    public verb(String phrase) {
        super(phrase);
    }

public verb(){
        super();
}

    public void addIng(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add ing to your verb. y|N");
        String choice = sc.nextLine();

        wantsING = choice.equals(String.valueOf('Y')) || choice.equals(String.valueOf('y'));

        if (wantsING) {
            phrase = phrase.concat("ing");
        }




    }

}
