
public class StarbuzzCofee {

	public StarbuzzCofee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost()); 
		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost()); 		
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2); 
		beverage2 = new Mocha(beverage2); 
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
		Beverage bev = beverage2;
        while(bev != null){
        	try {
        		System.out.println(bev.cost());
			} catch (Exception e) {
				
			}
        	   
        	bev = ((CondimentDecorator) bev).beverage;
        }
	}

}
