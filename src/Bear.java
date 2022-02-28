//class bear in the four seasons
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

            case WINTER:
                weight -= weight / 5.0;
                alertnessState = AlertnessState.sleep;
                return;

            case SPRING:
                weight -= weight / 4.0;
                break;

            case SUMMER:
                weight += weight / 3.0;
                break;

            case FALL:
                weight += weight / 4.0;
                break;
        }
        alertnessState = AlertnessState.awake;
    }
}