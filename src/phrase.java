import java.util.Scanner;

public class phrase {
    String pharse;
   static Boolean isGui;
    public phrase(String phrase){
       this.pharse = phrase;
    }

    public phrase(){
        String[] typeOfSpeech = getClass().toString().split(" ");

        if (!phrase.isGui) {
            System.out.println("Please type in a " + typeOfSpeech[1] + ".");
            Scanner readText = new Scanner(System.in);
            this.pharse = readText.nextLine();
        }
    }

    public String giveQuestion(){
        String[] typeOfSpeech = getClass().toString().split(" ");
        return "Please type in a " + typeOfSpeech[1] + ".";
    }

    public String givePhrase(){

        return pharse;
    }

    public void setPharse(String pharse) {
        this.pharse = pharse;
    }
}



