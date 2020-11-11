/**
 * @author Ian Worley
 * A madLib app for school project
 *     Copyright (C) 2020  Ian Worley
 */
public class Main {

    public static void main(String[] args) {


        madLib Game = new madLib();
        noun noun1 = new noun();
        String firstLine = Game.firstLine(noun1);
        String secLine = Game.secLine(noun1);
        String thirdLine = Game.thirdLine(new noun());
        String forthLine = Game.forthLine(new verb(), new adjective(), new proNoun() ,new adverb());
        System.out.println(firstLine + secLine + thirdLine + forthLine);

    }



}
