package lab5_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public final class PayCheck {
	private final double grossPay,fica,state,local,mediCare,socialSecurity;
	private final DateRange payPeriod ;
	
	
	
	public PayCheck(double grossPay, double fica, double state, double local, double mediCare, double socialSecurity,
			DateRange payPeriod) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.mediCare = mediCare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
		
	}
	public void print() {
	DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println(payPeriod.toString()+"\n");
		System.out.printf("Gross Pay $%.2f\n",getGrossPay());
		System.out.printf(" Fica:\t  $%.2f\n",fica);
		System.out.printf(" State:\t  $%.2f\n",state);
		System.out.printf(" Local:\t  $%.2f\n",local);
		System.out.printf(" Medic:\t  $%.2f\n",mediCare);
		System.out.printf(" Social:  $%.2f\n",socialSecurity);
		
		System.out.printf("Net Pay: $%.2f\n",getNetPay());
		
	}
	public double getNetPay() {
		double taxes=fica+state+local+mediCare+socialSecurity;
		System.out.println(grossPay+" " +taxes);
		return grossPay-taxes;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMediCare() {
		return mediCare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public DateRange getPayPeriod() {
		return payPeriod;
	}
	

}
