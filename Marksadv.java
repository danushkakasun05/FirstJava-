import java.util.*;
class Marksadv{
	public static void main(String[] args){
		Scanner input = new Scanner( System.in);
		System.out.print("Enter Nu of subject: ");
		int sub =input.nextInt();
		double total =0;
		double marks =0;
		for(int k=0;k<sub;k++){
		System.out.print("Enter subject "+(k+1)+" marks: ");
            marks = input.nextDouble();
		total=total+marks;
		}

		System.out.println("Total: "+ total);
		System.out.println("Average: "+ (total/sub));
		if ((total/sub) >=50){
			System.out.println("Final result: Pass");
		}else{

			System.out.println("Final result: Fail");
		}


}
}