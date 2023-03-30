package BusinessLogic;

import DataModels.Monomial;
import DataModels.Polynomial;

public class Operations {
	
	public static Polynomial addition(Polynomial p1, Polynomial p2) {
		Polynomial resultPolynom = new Polynomial();
		Monomial resultMonom = new Monomial();
		for(Monomial m1 : p1.getPolynom().values()) {
			for(Monomial m2 : p2.getPolynom().values()) {
				if(m1.getDegree() == m2.getDegree()) {
					m1.setSeen(true);
					m2.setSeen(true);
					double coefficient = resultMonom.addMonoms(m1, m2);
					resultMonom = new Monomial(m1.getDegree(), coefficient);
					resultPolynom.addMonom(resultMonom);
				}
			}
		}
		for(Monomial m : p1.getPolynom().values()) {
			if(m.isSeen() == false) {
				resultPolynom.addMonom(m);
			}
		}
		for(Monomial m : p2.getPolynom().values()) {
			if(m.isSeen() == false) {
				resultPolynom.addMonom(m);
			}
		}
		return resultPolynom;
	}
	
	public static Polynomial substract(Polynomial p1, Polynomial p2) {
		Polynomial resultPolynom = new Polynomial();
		Monomial resultMonom = new Monomial();
		for(Monomial m1 : p1.getPolynom().values()) {
			for(Monomial m2 : p2.getPolynom().values()) {
				if(m1.getDegree() == m2.getDegree()) {
					m1.setSeen(true);
					m2.setSeen(true);
					double coefficient = resultMonom.substMonoms(m1, m2);
					resultMonom = new Monomial(m1.getDegree(), coefficient);
					resultPolynom.addMonom(resultMonom);
				}
			}
		}
		for(Monomial m : p1.getPolynom().values()) {
			if(m.isSeen() == false) {
				resultPolynom.addMonom(m);
			}
		}
		for(Monomial m : p2.getPolynom().values()) {
			if(m.isSeen() == false) {
				resultPolynom.addMonom(m);
			}
		}
		return resultPolynom;
	}

}
