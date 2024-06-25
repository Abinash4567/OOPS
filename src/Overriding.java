class Animal{
    int height;
    int weight;

    void sleep()
    {
        System.out.println("Animals Sleeps Whole day");
    }
}

class Tiger extends Animal {
    int voice = 12;
    void sleep()
    {
        System.out.println("Tiger sleep whole night");
    }
}