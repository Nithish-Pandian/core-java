package electricitybill;
import java.util.Scanner;
public class Electricitybill {}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int units;
			float amount,surcharge;
			string name;
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the name:");
			name=sc.nextLine();
			System.out.println("Enter the units:");
			units=sc.nextInt();
			if (units>0 && units<=100) {
				amount=units*2;
			}
			else if(units>=100 && units<=300) {
				amount=100*2.0f+(units-100)*3.0f;
			}
			else {
				billamount=100*2.0f+200*3.0f+(units-300)*5.0f;
						surcharge = (billamount*2.5f)/100;
						billamount=billamount+surcharge;
			}
						System.out.println("customer name :"+name);
						System.out.println("no of units consumed ="+units);
					    System.out.println("bill amount :"+billamount);
					    sc.close();
			
			
		}

	}