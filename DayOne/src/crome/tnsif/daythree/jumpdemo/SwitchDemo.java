package crome.tnsif.daythree.jumpdemo;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userinput = 9;
		
		switch(userinput)
		{
		
		case 1 : System.out.println("Current recharge deatail");
		break;
		
		case 2 : System.out.println("Current recharge expirs");
		break;
		
		case 3: System.out.println("New Offer");
		break;
		
		case 4: System.out.println("talk to our customer care");
		break;
		
		default:
			System.out.println("invalid input");
		}

	}

}
