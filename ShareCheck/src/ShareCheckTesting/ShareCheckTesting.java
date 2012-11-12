package ShareCheckTesting;

import com.agile.share.check.Stock.DateString;
import com.agile.share.check.Stock.ShareCheck;
import junit.framework.TestCase;

public class ShareCheckTesting extends TestCase {
         
	private ShareCheck sharecheck;
	
	public ShareCheckTesting()
	{
		String [] stockSymbols  = new String [5];
		int [] stockShares = new int [5];
		stockSymbols[0] = "BP.L";
		stockSymbols[1] = "HSBA.L";
		stockSymbols[2] = "EXPN.L";
		stockSymbols[3] = "MKS.L";
		stockSymbols[4] = "SN.L";
		
		stockShares[0] = 192;
		stockShares[1] = 343;
		stockShares[2] = 258;
		stockShares[3] = 485;
		stockShares[4] = 1219;	
		
		sharecheck = new ShareCheck(stockSymbols, stockShares);
		sharecheck.requestStockDetails();
		sharecheck.printStockDetails();
		sharecheck.printStockPortfolioValue();	
	}
	
	public void testEmptyShares() {
		ShareCheck nullShareCheck = new ShareCheck();
		assertEquals(0, nullShareCheck.getStockShares().length);   
    }
	
	public void testEmptyItems() {
		ShareCheck nullShareCheck = new ShareCheck(); 
		assertEquals(0, nullShareCheck.items.length);
    }
	
	public void testEmptyStockSymbols() {
		ShareCheck nullShareCheck = new ShareCheck();
		assertEquals(0, nullShareCheck.getStockSymbols().length);   
    }
	
	public void testEmptyStockBeans() {
		ShareCheck nullShareCheck = new ShareCheck();
		assertEquals(0, nullShareCheck.getStockBeans().length);   
    }
	
	public void testIndividualStockSymbol()
	{
		assertEquals("BP.L", sharecheck.getStockSymbol(0));	
	}
	
	public void testNumberOfShares() {
        assertEquals(5, sharecheck.getStockShares().length);  
    }
	
	public void testIndividualShareName()
	{
		assertEquals("BP Amoco PLC",sharecheck.items[0]);
	}
	
	public void testNumberOfSharesNames()
	{
		assertEquals(5, sharecheck.items.length); 
	}
	
	public void testNumberOfStockSymbols(){
		assertEquals(5, sharecheck.getStockSymbols().length);  
	}
	
	public void testIndividualStockShares()
	{
		assertEquals(192, sharecheck.getStockShare(0));	
	}
	
	public void testDateTime()
	{
		DateString newDate = new DateString();
        assertEquals(newDate.updateDateString(), sharecheck.UpdateTime());
	}
	
	public void testTotalStockValue()
	{
		assertEquals(1549474.5, sharecheck.getStockPortfolioTotalValue(),0);	
	}
	
	public void testToBigDecimal()
	{
		assertEquals("�1,549,474",sharecheck.convertFloatToBigDecimal(sharecheck.getStockPortfolioTotalValue()));
	}
	
	public void testTotalShareValue()
	{
		assertEquals(82041.59375,sharecheck.getTotalStockValueForShare(0),0);
	}
	
	public void testTotalShareValueToBigDecimal()
	{
		assertEquals("�82,042",sharecheck.convertFloatToBigDecimal(sharecheck.getTotalStockValueForShare(0)));
	}
	
	
	
}
	
	
	

	

