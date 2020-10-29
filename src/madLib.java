public class madLib {

public madLib(){

}

public  String firstList(proNoun proNoun){
    String s = "You clearly haven't even played " + proNoun.givePhrase() + "\n";
    return s;
}
public String secLine(proNoun proNoun){
    String s = "Then you clearly haven't even played " + proNoun.givePhrase() + "\n";
    return s;
}

public String thirdLine(noun noun){
           String s = "It's mechanism,the "+ noun.givePhrase()  + "and that every second matters is what makes the game just a, masterpiece" + "\n";
           return s;
}
public String forthLine(verb verb, adjective adjective , adverb adverb){
    verb.addING();
String s = "the events " + verb.givePhrase() + " but the game itself and the "+ adjective.givePhrase() + " Ti hosted is tournament with the " + adverb.givePhrase() + " prizepool." + "\n";
    return s;
}



}
