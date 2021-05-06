import java.util.*;
class  EvenorOdd11
{
	 
		 public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        // int[]number=new int[10];
        // Scanner read = new Scanner (System.in);

int[] number={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter number :" );

        for(int i=0;i<number.length;i++){
           // number[i]=read.nextInt(); 

            if(number[i]%2==0){
                even.add(number[i]);  
                
            }
            else{
                odd.add(number[i]);
                
            }
        }

System.out.println(even +""+odd);   
// System.out.println("Odd number is " + odd);
    }
}
