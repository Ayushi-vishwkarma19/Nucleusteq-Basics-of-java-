
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
public class GenericsExample<G>{
    G object;
    GenericsExample(G object)
    {
        this.object =object;
    }
    public G get()
    {
        return object;
    }
    public static void main(String [] args)
    {
        String s=new String("Ayushi");
        List<Integer> list=Arrays.asList(5,7,9,7);
        GenericsExample<?> A=new GenericsExample<List>(list);
        System.out.println(A.get());
    }
}

