import java.util.Scanner;

public class baseSpeech {
    String word;
    String type;


    public baseSpeech(String type){
       this.type = type;
    }


    public baseSpeech(String word, String type){
        this.word = word;
        this.type = type;

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
        System.out.println("Please type in a "+ typeOfSpeech[1]);
        getUserInputForWord();

    }



    void getUserInputForWord(){
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
    public void setWord(String word) {
        this.word = word;
    }
}



