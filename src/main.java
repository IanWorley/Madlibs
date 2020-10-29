import javafx.application.Application;

public class main {

    public static void main(String[] args) {

        if (args.length > 0) {
            for (String s : args) {
                if (s == "--nogui") {
                    main.noGui();
                } else {

                    Application.launch(guiApp.class, args);
                }


            }


        }

        Application.launch(guiApp.class,args);


    }

    private static void noGui() {
        madLib Game = new madLib();
        proNoun proNoun1 = new proNoun();
        String firstLine = Game.firstList(proNoun1);
        String secLine = Game.secLine(proNoun1);
        String thirdLine = Game.thirdLine(new noun());
        String forthLine = Game.forthLine(new verb(), new adjective(), new adverb());
        System.out.println(firstLine + secLine + thirdLine + forthLine);

    }



}
