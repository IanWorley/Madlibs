import java.util.Scanner;

public class baseSpeech {
    String word;

    public baseSpeech(String phrase){
       this.word = phrase;
    }

    /**
     * The Constructor is use to generate input the following classes:
     * @see noun
     * @see proNoun
     * @see adverb
     * @see adjective
     */
    public baseSpeech() {
        String[] typeOfSpeech = getClass().toString().split(" ");
        System.out.println("Please type in a " + typeOfSpeech[1] + ".");
        Scanner readText = new Scanner(System.in);
        this.word = readText.nextLine();
    }

    /**
     * This gives back a string.
     * @return word (String)
     */
    public String givePhrase(){

        return word;
    }


    /**
     * This is use to debug don't use.
     * @param word (string)
     *
     */
    public void setPhrase(String word) {
        this.word = word;
    }
}



