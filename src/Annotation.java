
public class Annotation {
	
	int n; // property of annotation
	
	public Annotation() { // a constructor that initializes n = 0
		this.n = 0;
	}
	
	public Annotation(int n) { // a constructor that initializes n to an input
		this.n = n;
	}
	
	public int getn() { // returns n
		return this.n;
	}
	
	public String toString(int n) { // converts n to a string following the rules of fizzbuzz
		if (n % 3 == 0 & n % 5 == 0) { // if divisible by 3 and 5 returns FizzBuzz
			return "FizzBuzz";
		}
		else if(n % 3 == 0) { // if divisible by 3 but not 5 returns Fizz
			return "Fizz";
		}
		else if(n % 5 == 0) { // if divisible by 5 but not 3 returns Buzz
			return "Buzz";
		}
		else { // if not divisible by 3 or 5 returns n in string form
			return "" + n;
		}
	}
	
	static String annotateList(int start, int end) { // creates a list of numbers from start to end that have been converted by toString()
		String annotatedList = "";
		for (int i = start; i <= end; i++) {
			Annotation currentNum = new Annotation(i); // creates an instance to use the methods toString() and getn() on
			annotatedList = annotatedList + currentNum.toString(currentNum.getn());
			if (i != end) {
				annotatedList = annotatedList + " "; // if this is not the last number to be converted, adds a space after it in the string
			}
		}
		return annotatedList;
	}
}
