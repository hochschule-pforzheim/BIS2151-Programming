package hspf.unit01;

public class DemoCalls
{

    public static void main(String[] args)
    {
        hello();
        System.out.println(calculation());
        System.out.println("End of the method main");
    }

    public static void hello()
    {
        System.out.println("Hi World!");
        System.out.println("End of the method hello");
    }

    public static int calculation()
    {
        return 100;
    }

}
