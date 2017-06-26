package prime.prime;

import java.util.List;

import prime.util.PrimeUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 * 
 * 檢討項目：
 * 1. 確認 Maven 專案產生出來的 JUnit 版本，建議使用 JUnit 4 進行，才可以使用 Annotation 的方式
 * 2. 英文想個好名字的部分需要加強 (很多要用查的）
 * 3. 針對題目的演算法，如何一步一步進行推導
 * 4. 反應速度太慢，一次練習大約花了 30 分鐘
 * 5. Red -> Green -> Refactory
 * 6. 如何決定已經做了夠多的測試？
 * 7. 一個 Test Case 針對一個特定 Class 進行測試，如果實務上有疏漏的地方，在進行問題單修復時就必須進行調整更新
 * 8. 演算法可以再精進
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * Test get prime number
     * 如果測試的數據為 2
     * 則測試結果應為 [2]
     */
    public void testPrime(){
    	int data = 2;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(1, prime.size());
    	valideListResult(data, prime);
    }

	private void valideListResult(int data, List<Integer> prime) {
		int resultvalue = getListValue(prime);
    	assertEquals(resultvalue, data);
	}
    
    public void testPrime_WhenTestdatais3_thentheResultis3(){
    	int data = 3;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(1, prime.size());
    	valideListResult(data, prime);
    }
    
    public void testPrime_WhenTestdatais4_thentheResultis2plus2(){
    	int data = 4;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(2, prime.size());
    	valideListResult(data, prime);
    }
    
    public void testPrime_WhenTestdatais5_thentheResultis5(){
    	int data = 5;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(1, prime.size());
    	valideListResult(data, prime);
    }
    
    public void testPrime_WhenTestdatais6(){
    	int data = 6;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(2, prime.size());
    	valideListResult(data, prime);
    }
    
    public void testPrime_WhenTestdatais7(){
    	int data = 7;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(1, prime.size());
    	valideListResult(data, prime);
    }
    
    public void testPrime_WhenTestdatais8(){
    	int data = 8;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(3, prime.size());
    	valideListResult(data, prime);
    }
    
    public void testPrime_WhenTestdatais9(){
    	int data = 9;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(2, prime.size());
    	valideListResult(data, prime);
    }
    
    public void testPrime_WhenTestdatais10(){
    	int data = 10;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(2, prime.size());
    	valideListResult(data, prime);
    }
    
    public void testPrime_WhenTestdataisN(){
    	int data = 2*2*3*5*7*11*13*17;
    	List<Integer> prime = PrimeUtil.getPrime(data);
    	
    	assertEquals(8, prime.size());
    	valideListResult(data, prime);
    }

	private int getListValue(List<Integer> prime) {
		int resultvalue = 1;
    	for (Integer value : prime){
    		resultvalue = resultvalue * value.intValue();
    	}
		return resultvalue;
	}
    
}
