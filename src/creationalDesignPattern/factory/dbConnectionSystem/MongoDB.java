package creationalDesignPattern.factory.dbConnectionSystem;

public class MongoDB implements DbConnectionStrategy{
    @Override
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
}
