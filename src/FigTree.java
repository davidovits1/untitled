public class FigTree extends Tree {

    FigTree(int height, Season season) {
        super(height, season, Color.YELLOW);
    }

    @Override
    public String toString() {
        String str = "Fig tree. " + (season == Season.SUMMER ? "I give fruit. " : "") + super.toString();
        if(!thereIsLeaf){
            str += " and I have no leaves";
        }
        return  str;
    }


    @Override
    public void changeSeason() {
        super.changeSeason();

        switch (season) {
            case WINTER -> {
                height += 20;
                thereIsLeaf = false;
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
