import org.jetbrains.annotations.NotNull;

public class madLib {

    /**
     * Generates a madLib.
     */
public madLib(){

}


    /**
     * First line of the madLib.
     * @param noun noun class
     * @return String
     */
public  String firstLine( noun noun){
    return "You clearly haven't even played " + noun.givePhrase() + "\n";
}


    /**
     * Second Line of the madlib.
     * @param noun class
     * @return String
     */
public String secLine(noun noun){
    return "Then you clearly haven't even played " + noun.givePhrase() + "\n";
}

    /**
     * This is the third line of madline.
     * @param noun class
     * @return String
     */
public String thirdLine(noun noun){
    return "It's mechanism,the "+ noun.givePhrase()  + " and that every second matters is what makes the game just a, masterpiece" + "\n";
}


    /**
     *  This is the forth line of madlib.
     * @param verb verb class
     * @param adjective adjective class
     * @param  adverb adverb class
     * @return String
     */
public String forthLine(verb verb, adjective adjective, noun noun,  adverb adverb){
    verb.addIng();
    return "the events " + verb.givePhrase() + " but the game itself and the "+ adjective.givePhrase() + " " + noun.givePhrase() + " hosted is tournament with the " + adverb.givePhrase() + " prizepool." + "\n";
}

}
