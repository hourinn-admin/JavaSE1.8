package cn.oracle.tutorials.generics;

import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    private int i;

    public NaturalNumber(int i) { this.i = i; }
    // ...
}

class EvenNumber extends NaturalNumber {

    public EvenNumber(int i) { super(i); }
    // ...
}



public class GuideLinesWildcardUse {
	public static void main(String[] args) {
		List<EvenNumber> le = new ArrayList<>();
		le.add(new EvenNumber(1));
		le.add(new EvenNumber(2));
		List<? extends NaturalNumber> ln = le;
		ln.add(null);  // compile-time error
		
		System.out.println(ln.size());
		
		ln.remove(0);
		
		System.out.println(ln.size());
	}
}
