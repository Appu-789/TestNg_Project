package testng;

import org.testng.annotations.Test;

public class AnnotationsExample2 extends BaseClass{
	
    @Test(groups = {"sanity"})
	public void test3() {
	
	System.out.println("Inside test3");
	
    }

    @Test
    public void test4() {
    	System.out.println("Inside test4");
}
}