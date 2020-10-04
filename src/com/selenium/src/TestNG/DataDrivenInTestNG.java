package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenInTestNG {

    @DataProvider(name = "db1")
    public Object[][] dataBank1() {
        Object[][] obj = new Object[2][2];
        obj[0][0] = "admin";
        obj[0][1] = "manager";
        obj[1][0] = "admin1";
        obj[1][1] = "manager1";
        return obj;
    }

    @Test(dataProvider = "db1")
    public void getData(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider(name = "db2")
    public Object[][] dataBank2() {
        Object[][] obj2 = new Object[2][3];
        obj2[0][0] = "First username";
        obj2[0][1] = "First Password";
        obj2[0][2] = "First Address";
        obj2[1][0] = "Second Username";
        obj2[1][1] = "Second Password";
        obj2[1][2] = "Second Address";
        return obj2;
    }

    @Test(dataProvider = "db2")
    public void getData(String username, String password, String address) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(address);
    }







    }

