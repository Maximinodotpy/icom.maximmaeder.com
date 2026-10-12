public class Film {
    final private String title;
    final private int year;
    final private Person mainActor;

    public Film(String title, int year, Person mainActor) {
        this.title = title;
        this.year = year;
        this.mainActor = mainActor;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Person getMainActor() {
        return mainActor;
    }
}