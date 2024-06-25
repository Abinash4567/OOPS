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