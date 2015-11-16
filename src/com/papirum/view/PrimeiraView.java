package com.papirum.view;

import java.util.Scanner;

import com.papirum.model.PapirumFrame;

public class PrimeiraView {

	public static void main(String[] args) {
		PapirumFrame p = new PapirumFrame();
		
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		if(a.equals("Sair")){
			p.fechar();
		
		}
		in.close();
		
	}
	


}
