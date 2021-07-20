package app;

import java.util.Date;

public class AppelEmie extends Appel {

	@Override
	public double cout() {
		
		return dureeAppel*2;
	}

	public AppelEmie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelEmie(int numero, Date dateAppel, double dureeAppel) {
		super(numero, dateAppel, dureeAppel);
		// TODO Auto-generated constructor stub
	}

	
}
