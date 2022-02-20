public class Bear extends Animal {

    private AlertnessState alertnessState = AlertnessState.awake;

    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
    }

    @Override
    public String toString() {
        return  "Bear. " + (alertnessState == AlertnessState.awake ? "" : "I am sleeping. ") +  super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (season) {
            case WINTER -> {
                weight -= weight / 5;
                alertnessState = AlertnessState.sleep;
            }
            case SPRING -> weight -= weight / 4;

            case SUMMER -> weight += weight / 3;

            case FALL -> weight += weight / 4;

        }
    }
}
