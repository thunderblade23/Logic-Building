class DisCalc{
	public static void main(String [] args){

	double A = 250;
	boolean MembershipCard = true;
	double D = 0;
	
	if(A >= 1000){
		D = 20;
		}
	else if (A >= 500 && A <= 999){
		D = 10;
		}
	else{
		D = 5;
		}
	
	if (MembershipCard){
		D += 5;
		}
	
	double DA = (D / 100) * A;
	double FA = A - DA;
	
	System.out.println("Total Purchase Amount: " + A);
	System.out.println("Membership Card: " + (MembershipCard ? "Yes" : "No"));
	System.out.println("Discount applied: " + D);
	System.out.println("Discount Amount: " + DA);
	System.out.println("Amount to Pay: " + FA);
	}
}