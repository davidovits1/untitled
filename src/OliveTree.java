//class olive tree in the four seasons
public class OliveTree extends Tree {

    OliveTree(int height, Season season) {
        super(height, season, Color.GREEN);
    }

    @Override
    public String toString() {
        return "Olive tree. " + (season == Season.FALL ? "I give fruit. " : "") + super.toString();
    }

    @Override
    public void changeSeason() {

        super.changeSeason();

        switch (season) {

            case WINTER :
                height += 5;
                break;

            case SUMMER: height += 10; break;

            case SPRING: height += 10; break;

            case FALL:
                height += 5;
                isFruit = IsFruit.ThereIsFruit;
                return;
        }
        isFruit = IsFruit.ThereIsNoFruit;
    }

}