package solutions;
import java.util.;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.;


 
  @author RaigaR
 
public class Solutions 
{
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner(System.in);
	    int choose = 0;

	    while(choose = 0  choose = 15)
	    {
		    System.out.println(Enter the method number of the method you want to execute.);
		    System.out.println(METHOD#    tName);
		    System.out.println(  1       -- tCrazy Computers);
		    System.out.println(  2       -- tAnton And Polyhedrons);
		    System.out.println(  3       -- tBear And Big Brother);
		    System.out.println(  4       -- tCounting);
		    System.out.println(  5       -- tEvery Second);
		    System.out.println(  6       -- tBuying A House);
		    System.out.println(  7       -- tVitya in Countryside);
		    System.out.println(  8       -- tMIkeandPalindrome);

		    System.out.print(Method # );
		    choose = kbd.nextInt();
	    }
        System.out.println(n=============================================);
		switch (choose)
                {
                    case 1
                        m1();
                    break;
                
                    case 2
                        m2();
                    break;

                    case 3
                        m3();
                    break;

                    case 4
                        m4();
                    break;

                    case 5
                        m5();
                    break;        

                    case 6
                        m6();
                    break;

                    case 7
                        m7();
                    break;
                    
                    case 8
                        m8();
                    break;
                }

                
                
                
                
    }
    Codes

    public static void m8() {
        MyScanner scan = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        
        String input = scan.nextLine();
        int count = 0;
        for(int i=0; iinput.length()2; i++)
        {
            if(input.charAt(i) != input.charAt(input.length()-1-i))
                count++;
        }
        if(count==1)
            out.println(YES);
        else if(count == 0)
        {
            if(input.length()%2 != 0)
                out.print(YES);
            else
                out.println(NO);
        }
        else if(count = 2)
            out.print(NO);
        out.close();
    }

    public static void m7() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[93];
        
        for (int i = 0; i  n; i++){
            a[i] = scan.nextInt();
        }
        
        if (a[n - 1] == 15)
            System.out.println(DOWN);
        
        else if (a[n - 1] == 0)
            System.out.println(UP);
        
        else if (n == 1)
            System.out.println(-1);
        
        else if (a[n - 1]  a[n - 2])
            System.out.println(DOWN);
        
        else
            System.out.println(UP);
    }

    public static void m6() {
        Scanner kbd=new Scanner(System.in);
        int a=kbd.nextInt();
        int b=kbd.nextInt()-1;
        int c=kbd.nextInt();
        int f=0;
        int u=0;
        int[] d=new int[a];
        for(int i=0;ia;i++)
        {
            d[i]=kbd.nextInt();
        }
        if(canaffordside(d,b,c)){
            for (int i = b; i = 0; i--) 
            {
                if (d[i] = c&&d[i]!=0) 
                {
                    break;
                }
                f+=10;
            }
        }
        if(canaffordside1(d,b,c))
        {
            for (int i = b; i  d.length; i++) 
            {

                if (d[i] = c&&d[i]!=0) {

                    break;
                }
                u+=10;
            }
        }
        if((ufu==0)&&f!=0)
        {
            System.out.print(f);
        }else{
            System.out.print(u);
        }
    }

    public static void m5() throws NumberFormatException {
        5EverySecond
        Scanner in = new Scanner(System.in);
        int n =  Integer.parseInt(in.next());
        int[] A = new int[n];
        for(int i = 0; i  n; ++i) A[i] = Integer.parseInt(in.next());
        for(int i = 0; i  n2; i += 2) {
            int t = A[n-i-1];
            A[n-i-1] = A[i];
            A[i] = t;
        }
        for(int i = 0; i n; ++i)
            System.out.print(A[i] +  );

    }

    public static void m4() {
        4Counting
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList a = new ArrayList();
        for(int i=1;i=n;i++) a.add(i);
        
        int k=in.nextInt();
        int l=0;
        
        for(int i=0;ik;i++)
        {
            int j=in.nextInt();
            l=(l+j)%a.size();
            System.out.print(a.get(l)+ );
            a.remove(l);
            
        }
        --
    }

    public static void m3() {
        3BearAndBigBrother
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int yearsCount = 1;
        
        while (3  a = 2  b) {
            yearsCount++;
            a = 3;
            b = 2;
        }
        
        System.out.println(yearsCount);
        --
    }

    public static void m2() {
        2AntonAndPolyhedrons
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int sum = 0;
        
        
        for (int i = 0; i  n; i++)
        {
            String P=kbd.next();
            if(P.equals(Tetrahedron))
            {
                sum+=4;
            }
            else if(P.equals(Cube))
            {
                sum+=6;
            }
            else if(P.equals(Octahedron))
            {
                sum+=8;
            }
            else if(P.equals(Dodecahedron))
            {
                sum+=12;
            }
            else if(P.equals(Icosahedron))
            {
                sum+=20;
            }
        }
        System.out.println(sum);
        --
    }

    public static void m1() {
        1
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int ans = 0;
        int a, b = 0;
        
        for(int i = 1;i=n;i++)
        {
            a = scan.nextInt();
            if(a-b=c) ans++;
            else ans = 1;
            b = a;
        }
        System.out.println(ans);
        --
    }
    
        public static boolean canaffordside(int[] a, int b,int c)
        {

        for (int i = b-1; i = 0; i--) 
        {
            if (a[i] = c&&a[i]!=0) {
                return true;
            }
        }
        return false;
        }
        
        public static boolean canaffordside1(int[] a, int b,int c)
        {
                for (int i = b+1; i  a.length; i++)
                {
                    if (a[i] = c&&a[i]!=0) {
                        return true;
                    }
                }
            return false;
        }
   	public static PrintWriter out;   
        
        public static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		
		public MyScanner()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}
		String next()
		{
			while(st == null  !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt()
		{
			return Integer.parseInt(next());
		}
		
		long nextLong()
		{
			return Long.parseLong(next());
		}
		
		double nextDouble()
		{
			return Double.parseDouble(next());
		}
		float nextFloat()
		{
			return Float.parseFloat(next());
		}
		
		String nextLine()
		{
			String str = ;
			try
			{
				str = br.readLine();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}
        System.out.println("Thank you for using our program! :) ");

    
}
