package crome.tnsif.daythree.jumpdemo;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=5; k<15; k++)
		{
			
			//odd num skip
			
			if(k %2 !=0)
				continue;
			//even num printed
			System.out.println(k + " ");
		}

	}

}
