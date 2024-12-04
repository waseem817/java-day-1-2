public class SwapXOR
{
    public static void main(String[] args)
    {
        int a=20;
        int b=30;
        a=a^b;
        b=a^b;
        a=a^b;
        String res=String.format("after swapping the values of a and b are \n a=%d\n b=%d",a,b);
        System.out.println(res);
    }
}