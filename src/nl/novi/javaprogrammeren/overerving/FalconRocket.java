package nl.novi.javaprogrammeren.overerving;

public class FalconRocket extends Rocket {
    public int extraFuel = 10;

    public FalconRocket(int maximumFuel) {
        super(maximumFuel);
    }

    @Override
    public boolean hasEnoughFuel(int fuel) {
        if(super.hasEnoughFuel(fuel) || hasEnoughExtraFuel(fuel)) {
            return true;
        }

        return false;
    }

    private boolean hasEnoughExtraFuel(int fuel) {
        if(currentFuel + extraFuel > fuel) {
            decreaseExtraFuel(fuel);
            return true;
        }
        return false;
    }

    /*
    Element 2 (Uitdaging):
    Nadat er extra fuel gebruikt is, moet deze natuurlijk ook verminderd worden. Voeg dit toe aan de code.
    */
    private void decreaseExtraFuel(int fuel) {
        int extraFuelToUse = fuel - currentFuel;
        extraFuel = extraFuel - extraFuelToUse;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(" It has ").append(this.extraFuel).append(" extra fuel.");
        return stringBuilder.toString();
    }
}
