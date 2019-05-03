
public class Exercices {
	public static void main(String[] args) {
		int []tab= {16,22,2,49};
		int max=tab[0];
		String pattern="(IT|GL)[0-9]{3}USA||ST[0-9]{4}USA";
		String valeur="ST8763USA";
		System.out.println(valeur.matches(pattern));
		
		for(int i=1;i<tab.length;i++) {
			if(tab[i]<max) {
				max=tab[i];
			}
		}
		System.out.println("Max "+max);
	}
}
