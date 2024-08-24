class Multi3
{
    public static void main(String Arg[]) 
    {
       Thread t = Thread.currentThread();
       System.out.println("Current Name of Thread  "+t.getName());
       System.out.println("Priority of current Thread  "+t.getPriority()); 
    }
}