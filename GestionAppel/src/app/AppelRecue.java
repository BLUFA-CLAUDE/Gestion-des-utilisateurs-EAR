package app;

import java.util.Date;

public class AppelRecue extends Appel {

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return dureeAppel*2;
	}

	public AppelRecue() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelRecue(int numero, Date dateAppel, double dureeAppel) {
		super(numero, dateAppel, dureeAppel);
		// TODO Auto-generated constructor stub
	}
	
	

}
