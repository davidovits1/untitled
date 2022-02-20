public class FigTree extends Tree {

    FigTree(int height, Season season) {
        super(height, season, null);
    }

    @Override
    public String toString() {
        return "FigTree. " + (season == Season.SUMMER ? "I give fruit. " : "") + super.toString() + (leavesColor == null ? "and I have no leaves" : "");
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (season) {
            case WINTER -> {
                height += 20;
                leavesColor = null;
            }

            case SPRING -> {
                height += 30;
                leavesColor = Color.GREEN;
            }

            case SUMMER -> {
                height += 30;
                isFruit = IsFruit.ThereIsFruit;
            }

            case FALL -> {
                height += 20;
                leavesColor = Color.YELLOW;
            }
        }


    }
}
