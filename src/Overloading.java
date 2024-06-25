public class Overloading {
    Overloading()
    {
        int  a = 10;
        int b = 20;
        System.out.println(a + b);
    }
    Overloading(int a, int b)
    {
        System.out.println(a + b);
    }
    Overloading(int a, String b)
    {
        String str = Integer.toString(a);
        System.out.println(a + str);
    }
    void main(){
        System.out.println("Hello from Overloading function");
    }
}
