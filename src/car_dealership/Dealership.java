package car_dealership;

public class Dealership {

    public static void main(String[] args) {

        Customer cust1=new Customer();

        cust1.setName("Tom");
        cust1.setAddress("123 Anything");
        cust1.setCashOnHand(12000);

        Vehicle vehicle=new Vehicle("BMW","M3",25000);

        // Constructor yerine setter/getter da kullanabilirz ancak tek bir satirda yaparak daha
        //duzenli bir yapi elde ederiz

//		vehicle.setMake("Honda");
//		vehicle.setModel("Accord");
//		vehicle.setPrice(10000);

        Employee emp=new Employee();

        Vehicle car=new Vehicle("BMW","M3",25000);
        System.out.println(car.toString());


        boolean value=car.equals(vehicle);  //Bu sekilde direkt olarak iki objeyi karsilastiramayiz. Bu satirda karsilastirilan
        //sey hashCodelar olacaktir. iki objenin karsilastirilmasi icin Vehicle class inda hashCode and equals metodlarini generate
        //etmemiz gerekir.

        System.out.println(value);


        cust1.purchaseCar(vehicle, emp, false);



        /*
         *
         * handleCustomer(Customer cust,boolean finance,Vehicle vehicle)
         *
         * if(finance==true)
         * 		runCreditHistory(Customer cust,double dobuleAmount)
         * else if(vehicle.getPrice()<=cust.getCrashOnHand())
         * 		processTransaction(Customer cust, Vehicle vehicle)
         * else:
         * 		tell customer to bring more money
         *
         *
         *
         *
         *
         */


        Customer ali=new Customer("ali","ali",5);
//		ali.setName("ali");
        System.out.println(ali.getName());


    }

}
