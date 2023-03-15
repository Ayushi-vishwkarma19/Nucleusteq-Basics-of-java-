
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class WildCardGenerics {
    private static void Dis(List<?> list)
    {
        System.out.println(list);
    }
    public static void main(String [] args)
    {
        List<Integer> l1=Arrays.asList(1,2,3,4);
        List<?> l2=Arrays.asList('a','b');
        Dis(l1);
        Dis(l2);
    }
}
