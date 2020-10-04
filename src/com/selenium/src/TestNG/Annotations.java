package TestNG;

import org.testng.Reporter;
import org.testng.annotations.*;

public abstract class Annotations {

    @BeforeSuite
    public void a() {
        Reporter.log("Before Suite");
    }

    @AfterSuite
    public void b() {
        Reporter.log("After Suite");
    }

    @BeforeTest
    public void c() {
        Reporter.log("Before Test");
    }

    @AfterTest
    public void d() {
        Reporter.log("After Test");
    }

    @BeforeClass
    public void e() {
        Reporter.log("Before class");
    }

    @AfterClass
    public void f() {
        Reporter.log("After Class");
    }

    @BeforeMethod
    public void g() {
        Reporter.log("Before Method");
    }

    @AfterMethod
    public void h() {
        Reporter.log("After Method");
    }
}
