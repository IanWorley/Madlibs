
public class main {

    public static void main(String[] args) {


        madLib Game = new madLib();
        proNoun proNoun1 = new proNoun();
        String firstLine = Game.firstLine(proNoun1);
        String secLine = Game.secLine(proNoun1);
        String thirdLine = Game.thirdLine(new noun());
        String forthLine = Game.forthLine(new verb(), new adjective(), new proNoun() ,new adverb());
        System.out.println(firstLine + secLine + thirdLine + forthLine);

    }



}
