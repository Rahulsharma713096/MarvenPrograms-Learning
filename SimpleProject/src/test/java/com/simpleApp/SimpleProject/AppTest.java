package com.simpleApp.SimpleProject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	String[] s=new String[2];
    	s[0]="hello";
    	s[1]="Java";
    	App.main(s);
        assertTrue( true );
    }
}
