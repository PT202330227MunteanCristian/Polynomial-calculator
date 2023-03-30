package DataModels;

public class Monomial {
	
	private double coefficient;
    private double degree;
    private boolean seen;

    public Monomial(double degree, double coefficient) {
        this.coefficient = coefficient;
        this.degree = degree;
    }
    
    public Monomial() {
    	
    }

    public double getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getDegree() {
        return this.degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

	public boolean isSeen() {
		return seen;
	}

	public void setSeen(boolean seen) {
		this.seen = seen;
	}
	
	public double addMonoms(Monomial m1, Monomial m2) {
		return m1.getCoefficient() + m2.getCoefficient();
	}
	
	public double substMonoms(Monomial m1, Monomial m2) {
		return m1.getCoefficient() - m2.getCoefficient();
	}
	
	public String toString() {
		return getCoefficient() + "x^" + getDegree();
	}
}
