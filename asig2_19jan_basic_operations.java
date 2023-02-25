class operation
{
int res1,res2,res3,res4;

void set()
{
res1=(-1*+4*6);
res2=(35+5)%7;
res3=(14+(-4)*6/11);
res4=(2+15/6*1-7%2);
}

void dis()
{
System.out.println("res1="+res1);
System.out.println("res2="+res2);
System.out.println("res3="+res3);
System.out.println("res4="+res4);

}

}

public class asig2_19jan_basic_operations
{
public static void main(String[] args)
{
operation ob=new operation();
ob.set();
ob.dis();

}


}