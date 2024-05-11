//ArrayList

import java .util.*;

public class Collection2
{
    public static void main(String ard[])
    {
        ArrayList <String> aobj = new ArrayList<String>();

        aobj.add("PPA");
        aobj.add("LB");
        aobj.add("PYTHON");
        aobj.add("PPA++");
        aobj.add("LB++");

       for(String str : aobj)
       {
        System.out.println(str);
       }
    }
}