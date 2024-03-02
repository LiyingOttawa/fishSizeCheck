package lab4.task1.startercode;


public class Orange {
	//declaration of Class Orange's property 
	private int count;
	
	//create a constructor with no parameter
	public Orange() {
		
	}
	//create a constructor with a parameter
	public Orange(int count) {
		
	}
	//getter and setter
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	/*
	 * This is a worker method
	 * to get the cost per orange 
	 * through case selection structure(switch in java)
	 */
	public double costPerOrange() {
		double costPerOrange;
		
		switch (count) {
		case 163:
			costPerOrange = 0.061;
			break;
		case 150:
			costPerOrange = 0.067;
			break;
		case 138:
			costPerOrange = 0.072;
			break;
		case 125:
			costPerOrange = 0.080;
			break;
		case 113:
			costPerOrange = 0.088;
			break;
		case 100:
			costPerOrange = 0.100;
			break;
		case 88:
			costPerOrange = 0.114;
			break;
		case 80:
			costPerOrange = 0.125;
			break;

		default:
			costPerOrange = 0;
			break;
		}
		return costPerOrange;
	}
}
