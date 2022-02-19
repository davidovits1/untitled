public class OliveTree extends Tree {

    OliveTree(int height, Season season) {
        super(height, season, null);
    }

    @Override
    public String toString() {
        return "OliveTree: " + super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (season) {
            case WINTER -> {
                height += 5;
            }

            case SPRING -> {
                height += 10;
                leavesColor = Color.GREEN;
            }

            case SUMMER -> {
                height += 10;

            }

            case FALL -> {
                height += 5;
                leavesColor = Color.YELLOW;
            }
        }
    }

}
