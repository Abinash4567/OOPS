public class Blocks {
    int a;
    String str;
    static {
        System.out.println("Hello from Static Block");
    }

    {
        System.out.println("Hello from Instance Block");
    }

    Blocks()
    {
        a = 10;
        str = "Hello";
        System.out.println("Hello from Construtor");
    }

    void makeCall(){
        System.out.println("Hello from inside Methods");
    }
}
