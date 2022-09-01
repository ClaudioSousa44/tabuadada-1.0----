package br.senai.sp.jandira.model;

public class Multiplicacao {
	
	public double multiplicando;
	public double minMult;
	public double maxMult;
	public double res;
	
	public double getTabuada() {
		while(minMult <= maxMult) {
			res = multiplicando * minMult;
			minMult++;
			
		}
		return res;
		
	}
	
	public String getResultado() {
		
		while(minMult <= maxMult) {
			String exibir =  multiplicando + "X" + minMult + "=" + res;
			minMult++;
		}
		return exibir;
	}

}
