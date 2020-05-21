package dependency_inversion.good.test;

import dependency_inversion.good.MySQLDatabase;
import dependency_inversion.good.OracleDatabase;
import dependency_inversion.good.Connect;
import dependency_inversion.good.Connectable;
import dependency_inversion.good.DatabaseHandler;
import org.junit.Test;

public class GoodDatabaseTest {
    @Test
    public void TestPress() {
        Connectable a = new MySQLDatabase();
        Connect b = new DatabaseHandler(a);
        b.press();
        b.press();

        Connectable aa = new OracleDatabase();
        Connect bb = new DatabaseHandler(aa);
        bb.press();
        bb.press();
    }
}
