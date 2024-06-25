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

        Blocks b = new Blocks();
        b.makeCall();
        System.out.println("================= Inheritance Example ==============");

        Cat meow = new Cat(false, "milk", 4);
        System.out.println(meow.isVegetarian()); 

        System.out.println("============ Method Overloading ===============");

        Overloading o1 = new Overloading();
        o1.main();
        Overloading o2 = new Overloading(1, 2);
        o2.main();
        Overloading o3 = new Overloading(2, "mine");
        o3.main();

        System.out.println("================ Method Overriding ==============");
        Tiger t1 = new Tiger();
        t1.sleep();
    }
}