package dependency_inversion.good;

public class MySQLDatabase implements Connectable {
    public void connect(){
        System.out.println("connecting database..");
    }
    public void disconnect(){
        System.out.println("disconnecting database..");
    }
}