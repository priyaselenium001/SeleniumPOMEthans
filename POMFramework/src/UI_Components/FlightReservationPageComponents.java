package UI_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import bds_Queries.ServicesCall;

public class FlightReservationPageComponents {
	
	@FindBy(name="tripType")
	static List<WebElement> triptypeRadio;
	
	@FindBy(name="fromPort")
	static WebElement from;
	
	//radio size
	public boolean verifyRadiosize()
	{
		Integer actualSize = triptypeRadio.size();
		Integer expectedSize = ServicesCall.radioCount;
		if(actualSize.equals(expectedSize))
		return true;
		else
		return false;
	}
	
	//departing from is New York
	public boolean verifyDeparture()
	{
		Select departure = new Select(from);
        departure.selectByValue("New York");
		//List<WebElement>  dep = departure.getAllSelectedOptions();
		if(departure.equals("New York"))
			return true;
		else
		/*for(int i =0; i<dep.size();i++)
		{
			if(dep.get(i).equals(ServicesCall.dep))
				return true;
		}
		*/
		return false;
	}

}
