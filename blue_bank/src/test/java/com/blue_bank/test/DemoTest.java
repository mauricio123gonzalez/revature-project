package com.blue_bank.test;



import static org.junit.Assert.*;


import org.junit.Test;


class DemoTest {

	@Test
	public void testMultiplyException() {
		double result=0;
        MyClass tester = new MyClass();
        assertEquals("asdf", 700, tester.addDeposit(300, 400));
    }
	
	class MyClass {
		
        public double addDeposit(double balance, double deposit) {
            return (balance+deposit);
        }
    }
	
	}
	


