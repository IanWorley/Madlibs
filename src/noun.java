import java.util.Scanner;

public class noun extends baseSpeech {


    /**
     * This asks the users for a noun.
     * Takes methods from baseSpeech.
     * Overall most of the important stuff happens in the baseSpeech class.
     * Super calls the extend class baseSpeech.
     * @param word (String) Sets the word to be used in the class.
     * @see noun
     * @see baseSpeech
     */
    public noun(String word, String type) {
        super(word, type); // super calls the extend class basicSpeech
    }


    /**
     * This asks the users for a noun.
     * Takes methods from both noun and baseSpeech.
     * Overall most of the important stuff happens in the baseSpeech class.
     * Super calls the extend class noun.
     * @see noun
     * @see baseSpeech
     */
    public noun() {
        super(); // super calls the extend class basicSpeech

    }

    public noun(String word) {
    super(word);
    }

    public boolean isPerson(){
        return true;

    }
    public boolean isThing(){
        return true;
    }

    public boolean isPlace(){
       return true;

    }

}
