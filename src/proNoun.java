public class proNoun extends noun{

    /**
     * This asks the users for a Pronoun.
     * Takes methods from both noun and baseSpeech.
     * Overall most of the important stuff happens in the baseSpeech class.
     * super call the extend class noun.
     * @see noun
     * @see baseSpeech
     */


public proNoun(){
    super(); // super call the extend class noun.

}

    /**
     * This creates a Pronoun and sets the word for the pronoun.
     * Takes methods from both noun and baseSpeech.
     * Overall most of the important stuff happens in the baseSpeech class.
     * @param word (String) Sets the word to be used in the class.
     * @see noun
     * @see baseSpeech
     */
    public proNoun(String word) {
        super(word); // super call the extend class noun.
    }

    /**
     *
     * @param word String Word.
     * @param type String I.E. Person place or thing
     */
    public proNoun(String word, String type){super(word,type);}

}

