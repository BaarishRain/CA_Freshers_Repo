package ca.fresher;

import ca.fresher.Calculator;

import junit.framework.TestCase;

public class TestCases extends TestCase {

	public void testPositive() {

		String post_fix_expression = "2 3 + 4 +";
		Calculator calc = new Calculator();
		assertEquals("9.0", calc.result(post_fix_expression));

	}

	public void testPositive0() {
		String str = "1 2 + 4 -";
		Calculator value = new Calculator();
		assertEquals("-1.0", value.result(str));
	}

	public void testPositive1() {
		String str = "5 1 2 + 4 * + 3 -";
		Calculator value = new Calculator();
		assertEquals("14.0", value.result(str));
	}

	public void testPositive2() {
		String str = "2 2 + 3 *";
		Calculator value = new Calculator();
		assertEquals("12.0", value.result(str));
	}

	public void testPositive3() {
		String str = "3 1 - 2 2 + *";
		Calculator value = new Calculator();
		assertEquals("8.0", value.result(str));
	}

	public void testPositive5() {
		String str = "2 2 - 4 +";
		Calculator value = new Calculator();
		assertEquals("4.0", value.result(str));
	}

	public void testPositive4() {
		String str = "4 3 4 + 5 1 + 2 * + +";
		Calculator value = new Calculator();
		assertEquals("23.0", value.result(str));
	}

	public void testPositive8() {
		String str = "13 1 - 8 4 + *";
		Calculator value = new Calculator();
		assertEquals("144.0", value.result(str));
	}

	public void testPositive6() {
		String str = "14 1 + 23 *";
		Calculator value = new Calculator();
		assertEquals("345.0", value.result(str));
	}

	public void testPositive7() {
		String str = "25 3 + 7 / 2 -";
		Calculator value = new Calculator();
		assertEquals("2.0", value.result(str));
	}

	public void testPositive9() {
		String str = "25 -3 + -7 / 2 -";
		Calculator value = new Calculator();
		float value1 = Float.valueOf(value.result(str));
		//assertEquals("-5.142857", value.result(str));
		assertEquals(-5.14,value1,0.25);
	}
	
	public void testPositive10() {
		String str = "11234";
		Calculator value = new Calculator();
		assertEquals("11234.0", value.result(str));	
	}
	
	public void testPositive11() {
		String str = "11.2 3.4 +";
		Calculator value = new Calculator();
		assertEquals("14.6", value.result(str));	
	}
	
	public void testPositive12()
    {
           String str="0.5 7 * 1.5 - 0.4 /";
           Calculator value= new Calculator();
           assertEquals("5.0",value.result(str));
    }
	
	public void testPositive13()
	{		
		String str="3 % 4 5 * +";
		Calculator value= new Calculator();
        assertEquals("20.03",value.result(str));
	}

	public void testNegative1() {
		String str = "";
		Calculator value = new Calculator();
		assertEquals("Invalid expression", value.result(str));	
	}

	public void testNegative2() {
		String str = "3 + 4 -";
		Calculator value = new Calculator();
		assertEquals("Invalid expression", value.result(str));	
	}

	public void testNegative4() {
		String str = "+ - *";
		Calculator value = new Calculator();
		assertEquals("Invalid expression", value.result(str));	
	}
	
    public void testNegative5()
    {
           String str="a b c d %";
           Calculator value= new Calculator();
           assertEquals("Invalid expression",value.result(str));
           
    }
    
    public void testNegative6()
    {
           String str="10 /";
           Calculator value= new Calculator();
           assertEquals("Invalid expression",value.result(str));          
    } 

}
