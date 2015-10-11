package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor (Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.FooriSuund.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.FooriSuund.PAREM, primaryStage);
        tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);




    }
    public void tsykkel(Foor foor, int suund) {
        System.out.println(suund);
        if (suund % 2 == 0) {
            foor.vahetaPunast();
            foor.paus(1);
            foor.vahetaPunast();
            foor.syytaKollane();
            foor.paus(1);
            foor.kustutaKollane();
            foor.syytaRoheline();
            foor.paus(1);
        }

        else if (suund % 2 == 1) {
                foor.syytaRoheline();
            foor.paus(1);
            foor.kustutaRoheline();
                foor.syytaKollane();
            foor.paus(1);
            foor.kustutaKollane();
            foor.syytaPunane();
            foor.paus(1);
            int count = 0;
            while (count < 10)  {
                foor.syytaKollane();
                foor.paus(0.5);
                foor.kustutaKollane();
                count = count + 1;
            }

        }

    }


    }








