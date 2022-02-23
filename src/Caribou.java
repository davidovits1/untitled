public class Caribou extends Animal {

    private Roaming roaming;

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
    }

    @Override
    public String toString() {
        return  "Caribou: " + (season == Season.WINTER ? "I am migrating south. " :
                season == Season.SUMMER ? "I am migrating north. " : "")
                + super.toString();
    }

    @Override
    public void changeSeason() {

        super.changeSeason();

        switch (season) {

            case WINTER:
                color = Color.WHITE;
                roaming = Roaming.south;
                break;

            case SPRING:
                color = Color.BROWN;
                roaming = null;
                break;

            case SUMMER:
                roaming = Roaming.north;
                break;
        }
    }
}
