import java.util.Objects;

public class RecordsUnderstanding {
    public static void main(String[] args) {
        Alien a = new Alien(1, "Student1");
    }

}

/**
 * Record is a data carrier class. It does not have setter methods
 * because we just want to use Record class as plain data carriers.
 * Fields of a record are final (id, name here) and hence we can't change them.
 * These fields are also called component fields
 * @param id
 * @param name
 */
record Book(int id, String name) {


}

class Alien {
    private final int id;
    private final String name;

    public Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return id == alien.id && Objects.equals(name, alien.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

