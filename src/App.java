public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("================= Singleton Class Example ==============");
        PrivateClassDemo r1 = PrivateClassDemo.getInstance(20);
        PrivateClassDemo r2 = PrivateClassDemo.getInstance(30);
        if(r1==r2)  
        {
            System.out.println("Same instance");
            System.out.println(r1.height);
            System.out.println(r2.height);
        }
        System.out.println("============================================");

    }
}