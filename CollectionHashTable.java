
import java.util.Enumeration;
import java.util.Hashtable;




class CollectionHashTable
{
   public static void main(String Arg[]) 
   {

    Hashtable <String, Integer> hobj = new Hashtable<String , Integer>();

    hobj.put("C programming", 990);
    hobj.put("C++ programming", 1200);
    hobj.put("java programming", 780);
    hobj.put("python programming", 1650);

    System.out.println("Book price of java"+hobj.get("java programming"));
    hobj.remove("C++ programming");

    Enumeration eobj = hobj.keys();
    while(eobj.hasMoreElements())
    {
        System.out.println(eobj.nextElement());
    }
    
   }
}