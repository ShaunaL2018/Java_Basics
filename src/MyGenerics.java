import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyGenerics {

	public static void main (String[] args) {
		//genericsTest();
		//genericsTest2();
		
//		Set<String> mySet1 = new HashSet<>();
//		mySet1.add("first");
//		mySet1.add("second");
//		mySet1.add("whatever");
//		
//		Set<String> mySet2 = new HashSet<>();
//		mySet1.add("first");
//		mySet1.add("second");
//		mySet1.add("ficklesticks");
//		
//		System.out.println(unionTest(mySet1, mySet2));
//		Set<String> resultSet = unionTest(mySet1, mySet2);
//	
//		Iterator<String> itr = resultSet.iterator();
//		while(itr.hasNext()) {
//			String result = itr.next();
//			System.out.println("Iterating..." + result);
//		}
		
		Set<Integer> mySet3 = new HashSet<>();
		mySet3.add(2);
		mySet3.add(4);
		mySet3.add(6);
		
		Set<Integer> mySet4 = new HashSet<>();
		mySet4.add(2);
		mySet4.add(4);
		mySet4.add(7);
		
		System.out.println(unionTest(mySet3, mySet3));
		Set<Integer> set3 = unionTest(mySet3, mySet4);
	
		Iterator<Integer> iterator = set3.iterator();
		while(iterator.hasNext()) {
			Integer result = iterator.next();
			System.out.println("Iterating..." + result);
		}
	
	}
	
	public static void genericsTest() {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Hello");
		//myList.add(100);
		//myList.add(false);
		
		String myVal = myList.get(0);
		//String myVal2 = (String) myList.get(1);
			
	}
	
	public static void genericsTest2() {
		
		Container<String, Integer> myContainer = new Container< >("My Number", 125);
		System.out.println(myContainer.getItem());
		System.out.println(myContainer.getItem2());
	}
	
	public static <E> Set<E> unionTest(Set<E> first, Set<E> second) {
		Set<E> total = new HashSet<>(first);
		//when you define data type - Java knows for the instance creation - not really needed with Java 7 and lat er
		//can use random words or letters words for <E> 
		// We see <E> for Element, <T> for Type and <K,V> for Key/Value
		
		total.addAll(second);
		
		return total;
	}
	
	
}
