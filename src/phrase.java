import java.util.Scanner;

public class phrase {
    String phrase;
    public phrase(String phrase){
       this.phrase = phrase;
    }

    /**
     * The Constructor is use to make a phrase and also gain input from terminal
     */
    public phrase() {
        String[] typeOfSpeech = getClass().toString().split(" ");
        System.out.println("Please type in a " + typeOfSpeech[1] + ".");
        Scanner readText = new Scanner(System.in);
        this.phrase = readText.nextLine();
    }

    /**
     * This gives back a string.
     * @return phrase (String)
     */
    public String givePhrase(){

        return phrase;
    }


    /**
     * This is use to debug
     * @param phrase(string)
     *
     */
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}



