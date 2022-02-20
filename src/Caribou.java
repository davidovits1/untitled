public class Caribou extends Animal {

    private Roaming roaming;

    Caribou(int weight, Season season) {
        super(weight, season, Color.WHITE);
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
            case WINTER -> {
                color = Color.WHITE;
                roaming = Roaming.south;
            }
            case SPRING -> color = Color.BROWN;

            case SUMMER -> roaming = Roaming.north;
        }
    }
}
