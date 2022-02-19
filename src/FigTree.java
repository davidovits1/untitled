public class FigTree extends Tree {

    FigTree(int height, Season season) {
        // TODO: Implement.
        super(height, season, null);
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
