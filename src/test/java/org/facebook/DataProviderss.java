package org.facebook;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderss{
	@Test(groups="smoke")
	@DataProvider(name="login")
	private Object data() {
		
		Object obj[][]=new Object[][]
				{{"vishnunath","123"},
			{"akhila","456"},
			{"santhi","789"},
			{"sakthipriya","789"},
			{"varsha","123"}
				};
		return obj;
	

	}

}
