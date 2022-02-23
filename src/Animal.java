public abstract class Animal implements Seasonable, Comparable {
    protected int weight;
    protected Season season;
    protected Color color;

    Animal(int weight, Season season, Color color) {
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        Animal animal = (Animal) o;
        return this.weight > animal.weight ? 1 : this.weight < animal.weight ? -1 : 0;
    }

    @Override
    public String toString() {
        return "My weight is: " + weight + " and my color is: " + color;
    }

    public void changeSeason() {
        int currentSeason = season.ordinal() + 1;
        season = currentSeason == 4 ? Season.WINTER : Season.values()[currentSeason];
    }
}