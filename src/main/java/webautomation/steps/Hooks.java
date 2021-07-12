package webautomation.steps;

import cucumber.api.java.After;

import cucumber.api.java.Before;

import static webautomation.utils.DriverUtils.getDriver;
import static webautomation.utils.DriverUtils.tearDown;

public class Hooks {
    //control slash
    @Before
   public void setUp(){
        getDriver(); }

    @After
    public void teardown(){
   tearDown();
 }
}
