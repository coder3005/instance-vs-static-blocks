/* Instance Vs Static Blocks */
/* Instance */
class A
{
    A()
    {
        System.out.println("default constructor");
    }
    {   //instance
        System.out.println("abhi gupta");
    }
    public static void main(String[] args) {
        A r=new A();
    }
}
/*Static */
class A
{
    static{   //static
        System.out.println("abhi gupta");
    }
    public static void main(String[] args) {
    }
}
/*static */
class A
{
    int a=10; static int b=20;
    static{   //static
        System.out.println(b);
    }
    public static void main(String[] args) {
    }
}
/*instance*/
class A
{
    int a=10; static int b=20;
    { 
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        A r=new A();
    }
}
