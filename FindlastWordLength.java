import java.util.*;
public class FindlastWordLength
{
	public static void main(String[] args) {
		String a = "Hello World";
		StringTokenizer st = new StringTokenizer(a);
		ArrayList<Integer> arr = new ArrayList<>();
		while(st.hasMoreTokens()){
		    arr.add(st.nextToken().length());
		}
		System.out.println(arr.get((arr.size())-1));
	}
}
