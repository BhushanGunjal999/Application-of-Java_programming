
class Array3
{
    public static void main(String Arg[]) 
    {
        int Arr[][] = new int[3][];

        Arr[0] = new int[4];
        Arr[1] = new int[2];
        Arr[2] = new int[5];

        Arr[0][0] = 10;
        Arr[0][1] = 20;
        Arr[0][2] = 30;
        Arr[0][3] = 40;

        Arr[0][0] = 10;
        Arr[1][1] = 20;

        Arr[2][0] = 10;
        Arr[2][1] = 20;
        Arr[2][2] = 30;
        Arr[2][3] = 40;
        Arr[2][4] = 50;

        System.out.println(Arr.length);
        System.out.println(Arr[0].length);
        System.out.println(Arr[1].length);
        System.out.println(Arr[2].length);


    }

}