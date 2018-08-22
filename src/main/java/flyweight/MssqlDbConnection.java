package flyweight;

class MssqlDbConnection implements DbConnection{
    private String connectionName;
    
    public MssqlDbConnection(String connectionName) {
        this.connectionName = connectionName;
    }

    @Override
    public void getConnection() {
        System.out.println("Connection Name: " +  connectionName);
    }
}
