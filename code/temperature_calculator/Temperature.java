/* Nikita Rau CS 24 Temperature.java 2/15/15
 * Create a class that can be constructed with any of three types of temperatures (degrees celsius, Fahrenheit, Kelvin) 
 * e.g. (you can have a constructor with a two parameters - double degrees, and char scale.). Inside your class, 
 * implement a method to add and subtract temperature (independent of the type of temperature encoded.) You should be able to do 
 * Temperature a = new Temperature(75, ‘C’);
 * Temperature b = new Temperature(212, ‘F’);
 * Temperature c = a.add(b);
 * console.log(c.inCelsius()); —> “175ºC"*/

public class Temperature{
	private double deg, sum, diff, equation;
	private char units;

	public Temperature(double degrees, char scale){
		deg = degrees;
		units = scale;
	}

	public double calcEquation (Temperature num){
		if((this.units).compareTo(num.units)==0){
			return this.deg+num.deg;
		}

		else if(this.units=='C'){
			if(num.units=='F'){
				equation = (num.deg - 32)*(5/9);
			}
			else if (num.units=='K'){
				equation = num.deg - 273.15;
			}

		}

		else if(this.units=='F'){
			if(num.units=='C'){
				equation = (num.deg*9/5) + 32;
			}
			else if(num.units=='K'){
				equation = ((num.deg-273.15)*1.8000) + 32.00
			}
		}

		else if(this.units=='K'){
			if(num.units=='F'){
				equation = ((num.deg-32)/1.8000) + 273.15;
			}
			else if(num.units=='C'){
				equation = num.deg + 273.15;
			}
		}
		return equation;
	}

	public double add(Temperature num){
		sum = this.deg+calcEquation(num);
		return sum;
	}

	public double subtract(Temperature num){
		diff = this.deg-calcEquation(num);
		return diff;
	}
}