package ecc;

import algorithms.ExpandedEuclideanAlgorithm;
import algorithms.PrimeGenerator;

public class Fp extends Field<Integer> {

	protected int prime;
	
	public Fp(int p) {
		this.prime = p;
	}
	
	private int calcMod(Integer x) {
		x = x % this.prime;
		while(x < 0) x+= this.prime;
		x = x % this.prime;
		return x;
	}
	
	private boolean isPrimeField() {
		return PrimeGenerator.isPrime(this.prime);
	}
	

	@Override
	public Integer add(Integer x, Integer y) {
		// TODO Auto-generated method stub
		return this.calcMod(x+y);
	}

	@Override
	public Integer mult(Integer x, Integer y) {
		// TODO Auto-generated method stub
		return this.calcMod(x*y);
	}

	@Override
	public Integer invertAdd(Integer x) {
		// TODO Auto-generated method stub
		return this.calcMod(-x);
	}

	@Override
	public Integer invertMult(Integer x) {
		// TODO Auto-generated method stub
		if(this.isZero(x)) throw new IllegalArgumentException("Division by 0");
		ExpandedEuclideanAlgorithm eea = new ExpandedEuclideanAlgorithm();
		long inverse = eea.getPositiveMultInverseModK(x.intValue(), this.prime);
		return Integer.valueOf((int)inverse);
	}

	@Override
	public Integer getNewElement() {
		// TODO Auto-generated method stub
		return Integer.valueOf(1);
	}

	@Override
	public boolean isZero(Integer x) {
		// TODO Auto-generated method stub
		return x.intValue() == 0;
	}

	@Override
	public boolean isField() {
		// TODO Auto-generated method stub
		return this.isPrimeField();
	}

}
