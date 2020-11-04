import org.jetbrains.annotations.NotNull;

public class madLib {

    /**
     * Generates a madLib.
     */
public madLib(){

}


    /**
     * First line of the madLib.
     * @param proNoun proNoun class
     * @return String
     */
public  String firstLine(@NotNull proNoun proNoun){
    return "You clearly haven't even played " + proNoun.givePhrase() + "\n";
}


    /**
     * Second Line of the madlib.
     * @param proNoun pronNoun class
     * @return String
     */
public String secLine(@NotNull proNoun proNoun){
    return "Then you clearly haven't even played " + proNoun.givePhrase() + "\n";
}

    /**
     * This is the third line of madline.
     * @param noun noun class
     * @return String
     */
public String thirdLine(@NotNull noun noun){
    return "It's mechanism,the "+ noun.givePhrase()  + " and that every second matters is what makes the game just a, masterpiece" + "\n";
}


    /**
     *  This is the forth line of madlib.
     * @param verb verb class
     * @param adjective adjective class
     * @param  adverb adverb class
     * @return String
     */
public String forthLine(@NotNull verb verb, @NotNull adjective adjective, @NotNull proNoun proNoun , @NotNull adverb adverb){
    verb.addIng();
    return "the events " + verb.givePhrase() + " but the game itself and the "+ adjective.givePhrase() + " " + proNoun.givePhrase() + " hosted is tournament with the " + adverb.givePhrase() + " prizepool." + "\n";
}

}
