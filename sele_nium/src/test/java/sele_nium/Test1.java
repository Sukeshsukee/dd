package sele_nium;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generic.BaseClass;
import com.generic.Listner;

@Listeners(Listner.class)
public class Test1 extends BaseClass{
	@Test
	public void testsc() {
		int a = 10;
		int b = 0;

		
		    int result = a / b;
		    int num=0;
		
	}
}
