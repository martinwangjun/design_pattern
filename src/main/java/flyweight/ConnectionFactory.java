package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ConnectionFactory {
    private static Map<Object, DbConnection> 
        connectionPool = new HashMap<>();
    
    public ConnectionFactory() {
        
    }
    
    public DbConnection getConnection(Object object) {
        DbConnection dbConnection = connectionPool.get(object);
        if (dbConnection == null) {
            dbConnection = new MssqlDbConnection((String)object);
            connectionPool.put((String)object, dbConnection);
        }
        return dbConnection;
        
    }
    
    public int getCurrentConnectionSize() {
        return connectionPool.size();
    }
}
