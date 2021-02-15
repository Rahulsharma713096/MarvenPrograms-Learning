package com.simpleApp.SimpleProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.err.println( "Hello World!" );
        System.out.println(args);
        for(String s:args) System.err.println(s);
    }
}
