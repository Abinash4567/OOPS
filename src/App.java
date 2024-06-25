public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        PrivateClassDemo r1 = PrivateClassDemo.getInstance(20);
        PrivateClassDemo r2 = PrivateClassDemo.getInstance(30);
        if(r1==r2)  
        {
            System.out.println("Same instance");
            System.out.println(r1.height);
            System.out.println(r2.height);
        }

    }
}


class PrivateClassDemo{
    private static PrivateClassDemo pd;
    int height = 10;
    private PrivateClassDemo(int value){
        this.height = value;
    }
    public static PrivateClassDemo getInstance(int temp){
        if(pd==null)
            pd = new PrivateClassDemo(temp);
        return pd;
    }
}