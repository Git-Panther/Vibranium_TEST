import java.util.HashMap;
import java.util.Iterator;

import book.vo.Book;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Book> map = new HashMap<String, Book>();
		
		map.put(new Book().getCategory(), new Book());
		
		Iterator<String> keyItr = map.keySet().iterator();
		String key = null;
		while(keyItr.hasNext()){
			key = keyItr.next();
			System.out.println(key + " = " + map.get(key));
		}
		
	}

}
