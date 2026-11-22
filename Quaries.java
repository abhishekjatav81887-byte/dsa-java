import java.util.Scanner;
public class Main {
	static void printarr(int[] arr){
	    System.out.print("[ ");
	    
	    for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println("]");
	    
	}
	static int[] freearray(int[] array){
	    int[] temp = new int[100005];
	    for(int i=0;i<array.length;i++){
	        temp[array[i]]++;
	    }
	    return temp;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int x= sc.nextInt();
        int[] array= new int[x];
        
       
        
        
       for(int i=0;i<array.length;i++){
           array[i] = sc.nextInt();
       }
       printarr(array);
       
       
       System.out.print("how many your quaries : ");
       int n= sc.nextInt();
       
       int[] arr = freearray(array);
       int m =0;
       System.out.println("give me quaries : ");
       for(int i=1;i<=n;i++){
           int q=sc.nextInt();
           if(arr[q]==0 ) System.out.println("no ");
           else System.out.println("yes ");
           
       }
       
       
       
       
	}
	
	
}
