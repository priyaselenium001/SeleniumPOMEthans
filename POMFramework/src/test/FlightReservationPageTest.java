package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightReservationPageTest extends AbstractTest {
	
	@Test(priority = 1,description = "Verify Radio")
	public void verifyRadio()
	{
		Assert.assertTrue(reservationPageComponent.verifyRadiosize(), "verify radio");
	}
	
	@Test(priority = 2,description = "Verify from port")
	public void verifyfromPort()
	{
		Assert.assertTrue(reservationPageComponent.verifyDeparture(), "verify departure");
	}

}
