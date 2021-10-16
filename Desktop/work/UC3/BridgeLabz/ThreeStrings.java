package com.TestMaximum.UC3.BridgeLabz;

public class ThreeStrings {
	   
	    public void TC1()
	    {
	        int result=ThreeStrings.max(30,20,10);
	        assertEquals(30,result);
	    }
	    
	    private void assertEquals(int i, int result) {
			// TODO Auto-generated method stub
			
		}

		public void TC2()
	    {
	        int result=ThreeStrings.max(20,30,10);
	        assertEquals(30,result);
	    }
	    
	    public void TC3()
	    {
	        int result=ThreeStrings.max(20,10,30);
	        assertEquals(30,result);
	    }
	    
	    public void floatMaxTC1()
	    {
	        float result=ThreeStrings.max(5.5f,0.01f, 1.02f);
	        assertEquals(5.5f,result,0.0f);
	    }
	    
	    private void assertEquals(float f, float result, float g) {
			// TODO Auto-generated method stub
			
		}

		public void floatMaxTC2()
	    {
	        float result=ThreeStrings.max(0.01f,5.5f, 1.02f);
	        assertEquals(5.5f,result,0.0f);
	    }
	    public void floatMaxTC3()
	    {

	        float result=ThreeStrings.max(0.01f,1.02f, 5.5f);
	        assertEquals(5.5f,result,0.0f);
	    }
	    
	    public void StringMaxTC1()
	    {
	        String result=ThreeStrings.max("Apple","Peach","Banana");
	        assertEquals("maximum result","Peach",result);
	    }
	    
	    public void StringMaxTC2()
	    {
	        String result=ThreeStrings.max("Apple","Bananna","Peach");
	        assertEquals("maximum result","Peach",result);
	    }
	    
	    public void StringMaxTC3()
	    {
	        String result=ThreeStrings.max("Peach","Bananna","Apple");
	        assertEquals("maximum result","Peach",result);
	    }
}
