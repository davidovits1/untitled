public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    protected IsFruit isFruit = IsFruit.ThereIsNoFruit;
    protected boolean thereIsLeaf = true;

    Tree(int height, Season season, Color leavesColor) {
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }


    @Override
    public String toString() {
        return "My height is: " + height + " and my color is: " + leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    public void changeSeason() {
        int currentSeason = season.ordinal() + 1;
        season = currentSeason == 4 ? Season.WINTER : Season.values()[currentSeason];
    }

    @Override
    public int compareTo(Object o) {
        Tree tree = (Tree) o;
        return height > tree.height ? 1 : height < tree.height ? -1 : 0;
    }
}
