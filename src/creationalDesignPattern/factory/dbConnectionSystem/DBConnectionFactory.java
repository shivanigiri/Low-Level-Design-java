package creationalDesignPattern.factory.dbConnectionSystem;

public class DBConnectionFactory {
    public static DbConnectionStrategy getDBConnection(String dbType){
        if("postgres".equalsIgnoreCase(dbType)){
            return new PostgresDB();
        }else if("mongodb".equalsIgnoreCase(dbType)){
            return new MongoDB();
        }
        return null;
    }
}
