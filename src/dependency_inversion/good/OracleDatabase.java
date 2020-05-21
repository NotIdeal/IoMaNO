package dependency_inversion.good;

public class OracleDatabase implements Connectable {
    public void connect(){
        System.out.println("connecting to oracle..");
    }
    public void disconnect(){
        System.out.println("disconnecting from oracle..");
    }
}