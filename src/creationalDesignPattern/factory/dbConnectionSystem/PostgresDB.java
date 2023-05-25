package creationalDesignPattern.factory.dbConnectionSystem;

public class PostgresDB implements DbConnectionStrategy{
    @Override
    public void connect() {
        System.out.println("Connected to PostgresSQL");
    }
}
