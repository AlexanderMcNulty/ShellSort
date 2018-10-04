import java.util.Random;

public class ShellSort {
	private int[] sortie;
	
	public ShellSort(int[] sortie) {
		this.sortie = sortie;
	}
	
	public void sort() {
		int iterator=1;
		int temp;
		int countdown=0;
		
		while(iterator > 0) {
			iterator = sortie.length / 3 - countdown;
			for(int i = iterator; i < sortie.length; i++) {
				if(sortie[i]<sortie[i-iterator]) {
					temp = sortie[i];
					sortie[i] = sortie[i-iterator];
					sortie[i-iterator] = temp; 
				}
			}
			countdown++;
		}
		
	}
	
	public String toString() {
		String theString = "[";
		for(int s : sortie) {
			theString = theString +  s + ", ";
		}
		theString = theString.substring(0,theString.length()-2);  
		theString = theString + "]";
		return theString;
	}
	
	public static void main(String[] args) {
		int[] s = new int[20];
		Random gen = new Random(34231);
		for(int i=0; i < s.length; i++) {
			s[i] = gen.nextInt(401);
		}
		ShellSort sorted = new ShellSort(s);
		System.out.println(sorted.toString());
		sorted.sort();
		System.out.println(sorted.toString());
	}
	
	
}
