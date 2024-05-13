public class RecordsUnderstanding {
    public static void main(String[] args) {

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

