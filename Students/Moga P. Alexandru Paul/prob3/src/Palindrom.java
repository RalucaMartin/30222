public class Palindrom
{
    public static boolean palindrom(int n)
    {
        int r=0,aux=0,inv=0;
        aux=n;
        while(aux>0)
        {
        	r=aux%10;
        	inv=inv*10+r;
        	aux=aux/10;
        }
        if(n==inv)
        	return true;
        else
        	return false;
    }

    public static void main(String[] args)
    {
        for(int i=999;i>=100;i--)
        {
            for(int j=999;j>=100;j--)
            {
                int n = i*j;
                if(palindrom(n))
                {
                    System.out.printf("%d cel mai mare palindrom",n);
                    return;
                }
            }
        }
    }
}