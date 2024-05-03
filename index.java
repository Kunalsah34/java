// public class index{
//     public static void main(String[] args){
//         int a =4;

// 	System.out.println(a);

//     }
// }


// public class index{
// 	public static void main(String[] args){
// 		int f=1;
// 		int n =4;

// 		for(int i=0; i<n; i++){
// 			f=f*(i+1);
// 		}
// 		System.out.println(f);		

// 	}
// }


public class index{
	public static void main(String[] args){
        int n=50;
        int s=0;
        for(int i=1; i<=n; i++)
        {
            if(checkprime(i)==true)
                s=s+i;
        }
        System.out.println(s);

	}

    public static boolean checkprime(int n){
        int c=0;
        for(int i=1; i<n; i++){
            if(n%i==0)
                c++;
        }
        if(c>2)
            return false;
        else
            return true;
    }

}