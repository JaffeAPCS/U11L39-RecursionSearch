import java.util.*;

/**
 * Write a description of class Search here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Search
{
    /**
     * Linear search through an array
     * 
     * @param  x   Array of integers to search
     * @param  n   Integer to search for
     * @return     true if integer was found 
     */
    public static boolean search(int[] x, int n)
    {
        for(int i = 0; i < x.length; i++) { 
            if (x[i] == n) 
            return true; 
        } 
        return false; 
    }
    
    /**
     * Recursive search through an array
     * 
     * @param  x   Array of integers to search
     * @param  n   Integer to search for
     * @return     true if integer was found 
     */
    public static boolean searchRecursive(int[] x, int n)
    {

    }
    
}
