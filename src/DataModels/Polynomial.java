package DataModels;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial {
	
	private Map<Double, Monomial> polynom;

	public Polynomial() {
		setPolynom(new TreeMap<>(Collections.reverseOrder()));
	}

	public Map<Double, Monomial> getPolynom() {
		return polynom;
	}

	public void setPolynom(Map<Double, Monomial> polynom) {
		this.polynom = polynom;
	}
	
	public void addMonom (Monomial monom) {
		polynom.put(monom.getDegree(), monom);
	}
	
	public Monomial getMonomial (double power) {
		return polynom.get(power);
	}
	
	public Monomial get(double power) {
		return null;
	}
	
	public void splitPolynom(String polynom, Polynomial pol) { 
		Pattern pattern = Pattern.compile("([+-]?\\d*)(x\\^?)(\\d*)"); //([+-]?[^-+]+)
		Matcher matcher = pattern.matcher(polynom);
		int x=0;
		while (matcher.find()) {
		    x=x+1;
		    Monomial m = new Monomial(Double.parseDouble(matcher.group(3)), Double.parseDouble(matcher.group(1)));
		    pol.addMonom(m);
//		    if(pol.getMonomial(Double.parseDouble(matcher.group(3))) != null) {
//		    	pol.getMonomial(Double.parseDouble(matcher.group(3))).setCoefficient(pol.getMonomial(Double.parseDouble(matcher.group(3))).getCoefficient() + m.getCoefficient());
//		    }
//		    else {
//		    	pol.addMonom(m);
//		    }
		}
	}
	
	public String toString() {
	    String result = "";
	    int lastIndex = polynom.size() - 1; // Index of the last element in the polynom collection
	    int currentIndex = 0; // Current index of the element being processed in the for loop
	    for (Monomial m1 : polynom.values()) {
	        result += m1.toString(); // Add the current Monomial to the result string
	        // Add a "+" sign if this is not the last element in the polynom collection
	        if (currentIndex != lastIndex) {
	            result += "+";
	        }
	        currentIndex++; // Increment the current index
	    }
	    result = result.replace("+-", "-");
	    return result;
	}
	
}
