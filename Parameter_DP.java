package tempTestNG;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter_DP {
 


    @Test(dataProvider="SearchProvider")
    public void testMethod(String name,String state) throws InterruptedException{
    {
        System.out.println("Welcome ->"+name+"; He is from ->"+state);
        Thread.sleep(1000);
        }
    }
    /**
     * @return Object[][] where first column contains 'name'
     * and second column contains 'state'
     */
    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Pankaj", "Uttar Pradesh" },
            { "Sree Vatsa", "Karnataka" },
            { "Neeraj", "Gujarat" },
            { "Basu" , "West Bengal"},
            { "Naveen ", "Orissa"}
        };

    }

}