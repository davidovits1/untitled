public class OliveTree extends Tree {

    OliveTree(int height, Season season) {
        super(height, season, null);
    }

    @Override
    public String toString() {
        return "OliveTree. " + (season == Season.FALL ? "I give fruit. " : "") + super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (season) {
            case WINTER -> height += 5;

            case SPRING, SUMMER -> height += 10;

            case FALL -> {
                height += 5;
                isFruit = IsFruit.ThereIsFruit;
            }
        }
    }

}
