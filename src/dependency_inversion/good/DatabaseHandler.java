package dependency_inversion.good;

public class DatabaseHandler implements Connect{
    private Connectable database;
    public boolean connected;
    public DatabaseHandler(Connectable database){
        this.database = database;
        this.connected = false;
    }

    public boolean isConnected(){
        return this.connected;
    }
    public void press(){
        boolean check = isConnected();
        if(check){
            this.database.disconnect();
            this.connected = false;
        } else{
            this.database.connect();
            this.connected = true;
        }
    }

}