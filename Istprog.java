class Istprog
{
    void set_values(){
        String name = "Jahnvi Tripathi";
        int n = 84;
        float f = 8.8f;
        double d = 7.8; 
        boolean bo = true;
        char c = 'A';  
        display(name,n,f,d,bo,c);
    }
    void arith()
    {
        int s1 = 1 + 2; 
        int s2 = 1 % 2; 
        int s3 = 1 - 2; 
        int s4 = 1 * 2; 
        int s5 = 1 / 2; 
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
    void assign()
    {
        int s1 = 10;
        System.out.println(s1);
        s1 += 10;
        System.out.println(s1);
        s1 -= 10;
        System.out.println(s1);
        s1 *= 10;
        System.out.println(s1);
        s1 /= 10;
        System.out.println(s1);
    }
    void relat()
    {
        boolean bo1 = 10 < 20; 
        System.out.println(bo1);
        boolean bo2 = 10 > 20; 
        System.out.println(bo2);
        boolean bo3 = 10 <= 20; 
        System.out.println(bo3);
        boolean bo4 = 10 >= 20; 
        System.out.println(bo4);
        boolean bo5 = 10 == 20; 
        System.out.println(bo5);
        boolean bo6 = 10 != 20; 
        System.out.println(bo6);
    }
    void logical()
        {
            boolean bo1 = (10==10 && 0==0);
            System.out.println(bo1);
            boolean bo2 = (10==1 || 0==10);
            System.out.println(bo2);
            boolean bo3 = !(10==1 && 0==0);
            System.out.println(bo3);
        }
    void unary()
    {
        int n = 10;
        System.out.println(n);
        n++;
        System.out.println(n);
        n--;
        System.out.println(n);
    }
    void cond()
    {
        String ans = (10 == 10) ? "True":"False";
        System.out.println(ans);
    }
    void display(String name,int n,float f, double d,boolean bo,char c){
        System.out.println(name);
        System.out.println(n);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bo);
        System.out.println(c);
    }
    public static void main(String[] args) 
    {
            Istprog obj = new Istprog();
            obj.set_values();
    }
}