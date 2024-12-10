package testNG;
import org.testng.annotations.*;


public class TestngParam {
	
	@Test
	@Parameters({"i","j"})
	public void add(int a ,int b)
	{
		System.out.println("Addition:" + (a+b));
	}

	@Test
	@Parameters({"i","j"})
	public void Substract(int a ,int b)
	{
		System.out.println("Substration:" +(a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void Multiply(int a ,int b)
	{
		System.out.println("Multiplication:" +(a*b));
	}
	
}
/*
<suite name="MathOperationsSuite">
    <test name="ArithmeticOperationsTest">
        <parameter name="i" value="10"/>
        <parameter name="j" value="5"/>
         <classes>
            <class name="TestngParam"/>
        </classes>
    </test>
</suite>
*/
