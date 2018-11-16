package com.qa.Garage;

 class MotorBike extends Vehicle {
	 public Boolean backSeat;
	 
	 MotorBike( String owner ,int weight, int wheels , int value, Boolean backSeat){
		 super(owner,weight ,wheels, value);
         this.backSeat=backSeat;
     	Garage.catalogue.add(this);

        
	 }
	 
	 public int getprice() {
			return (200);
	 }
}
