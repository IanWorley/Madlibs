import java.util.Scanner;

public class verb extends baseSpeech {
public boolean wantsING;

    /**
     * This creates a verb and sets the word for the verb.
     * Takes methods from both verb and baseSpeech.
     * Overall most of the important stuff happens in the baseSpeech class.
     * @param word (String) Sets the word to be used in the class.
     * @see baseSpeech
     */
    public verb(String word) {
        super(word); // super call the extend class basicSpeech
    }

    /**
     * This asks the users for a verb.
     * Takes methods from both verb and baseSpeech.
     * Overall most of the important stuff happens in the baseSpeech class.
     * super call the extend class noun.
     * @see baseSpeech
     */
public verb(){
        super(); // super call the extend class basicSpeech
}

    /**
     * Adds an ing at the end of verb.
     */
    public void addIng(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add ing to your verb. y|N");
        String choice = sc.nextLine();

        wantsING = choice.equals(String.valueOf('Y')) || choice.equals(String.valueOf('y'));

        if (wantsING) {
            word += word.concat("ing");
        }




    }

}
