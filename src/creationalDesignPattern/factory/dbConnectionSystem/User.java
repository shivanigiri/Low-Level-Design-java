package creationalDesignPattern.factory.dbConnectionSystem;

public class User {
    public static void main(String args[]) {
        DbConnectionStrategy dbConnectionStrategy = DBConnectionFactory.getDBConnection("mongoDB");
        dbConnectionStrategy.connect();
        dbConnectionStrategy = DBConnectionFactory.getDBConnection("Postgres");
        dbConnectionStrategy.connect();
    }
}
