package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Multiplicacao {
	
	public double multiplicando;
	public double minMult;
	public double maxMult;
	public ArrayList<String> exibir = new ArrayList<String>();
	public double res;
	
	public double getTabuada() {
		while(minMult <= maxMult) {
			res = multiplicando * minMult;
			minMult++;
			
		}
		return res;
		
	}
	
	public ArrayList<String> getResultado() {
		
		while(minMult <= maxMult) {
			 exibir.add(multiplicando + "X" + minMult + "=" + res);
			minMult++;
		}
		return exibir;
	}

}
