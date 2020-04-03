package tempTestNG;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Parameter_DP_dc {

    @Test(dataProvider="SearchProvider")
    public void testMethodA(String name,String state) throws InterruptedException{
    
        System.out.println("Welcome ->"+name+"; He is from ->"+state);
        Thread.sleep(1000);    
    }
    
    @Test(dataProvider="SearchProvider")
    public void testMethodB(String country) throws InterruptedException{
        System.out.println("Welcome  to ->"+country);
        Thread.sleep(1000);    
    }

    /**
     * @return Object[][] where first column contains 'name'
     * and second column contains 'state'
     */
    
    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(Method m){
        if(m.getName().equalsIgnoreCase("testMethodA")){
        return new Object[][] {
            { "Pankaj", "Uttar Pradesh" },
            { "Sree Vatsa", "Karnataka" },
            { "Neeraj", "Gujarat" }
            };}
        else {
        return new Object[][] {
                { "India" },
                { "China" },
                { "Russia" }
            };}       
    }

    
    
}
