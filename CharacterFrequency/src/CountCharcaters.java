import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharcaters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		Map<Character,Integer> charcatersMap = new HashMap<>();
		
		System.out.println("Enter String to count characters frequency : ");
		input = sc.nextLine();
		
		for(int i=0; i<input.length();i++) {
			char c = input.charAt(i);
			charcatersMap.put(c, charcatersMap.getOrDefault(c, 0)+1);
		}
		
		System.out.println(charcatersMap);
		bye();
		sc.close();
	}
	
	public static void bye() {
		System.out.println("Byee");
	}

}
