package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.FalconRocket;
import nl.novi.javaprogrammeren.overerving.Rocket;

public class Main {
    /*
    Bekijk onderstaande code. Er zijn twee klasse, twee objecten.
    FalconRocket extends Rocket.

    Deze opdracht bestaat uit twee elementen. Het eerste element is om te oefenen. Het tweede element is een uitdagende
    opdracht.

    Element 1:
    De FalconRocket heeft reserve brandstof (extraFuel). Wanneer de raket niet genoeg fuel lijkt te hebben, moet er
    gekeken worden of er genoeg fuel is in extraFuel om het tekort op te vangen. Als dat zo is, moet er alsnog `true`
    geretourneerd worden.

    Element 2 (Uitdaging):
    Nadat er extra fuel gebruikt is, moet deze natuurlijk ook verminderd worden. Voeg dit toe aan de code.

     */

    public static void main(String[] args) {
        Rocket genericRocket = new Rocket(100);

        genericRocket.fly(10);
        System.out.println(genericRocket.toString());

        FalconRocket notEnoughFuel = new FalconRocket(12);
        notEnoughFuel.fly(23);
        System.out.println(notEnoughFuel.toString());

        FalconRocket enoughFuel = new FalconRocket(12);
        enoughFuel.fly(21);
        System.out.println(enoughFuel.toString());

        FalconRocket enoughNormalFuel = new FalconRocket(10);
        enoughNormalFuel.fly(9);
        System.out.println(enoughNormalFuel.toString());

    }
}
