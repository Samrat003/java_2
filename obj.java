//Implement the concept of object cloning by passing a object as a parameter to a constructor , take input as a command line argument
class test{
    int a,b;
    test(int x,int y){
        a=x;
        b=y;
    }
    test(test o){
        int c=o.a+o.b;
        System.out.println(c);
    }
}
class obj{
    public static void main(String[] a) {
        int z=Integer.parseInt(a[0]);
        int k=Integer.parseInt(a[1]);
        test ob=new test(z,k);
        test ob1=new test(ob);
    }
}