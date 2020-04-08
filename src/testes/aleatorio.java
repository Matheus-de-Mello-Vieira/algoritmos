package testes;

import java.util.ArrayList;
import java.util.Comparator;

public class aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList();
		a.add(1);a.add(2);a.add(3);
		
		a.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer c1, Integer c2) {
					// TODO Auto-generated method stub
					return c2 - c1;
				}
			});
		
		for(Integer n:a) {
			System.out.println(n);
		}
	}

}
