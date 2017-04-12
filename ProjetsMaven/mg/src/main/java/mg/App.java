package mg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("test");
        System.out.println("Max : " + max(4,5));
    }


public static int max(int a, int b)
{
	return a < b?b:a;
}
}