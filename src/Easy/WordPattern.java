package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean wordPattern(String pattern, String s) {

		Boolean flag = false;
		Boolean flag1 = false;

		Map<String, String> hp = new HashMap();
		Set<String> set = new HashSet();

		String[] one = pattern.split("");
		String[] two = s.split(" ");

		if ((one.length) != (two.length))

			for (int i = 0; i <= one.length - 1; i++) {
				if (!(hp.containsKey(one[i]))) {
					hp.put(one[i], two[i]);
					flag = true;
				} else if ((hp.containsKey(one[i])) && !(hp.get(one[i]).equals((two)[i]))) {
					flag = false;
					flag1 = true;
					break;
				}
			}

		if (flag1 == false) {
			for (String value : hp.values()) {
				set.add(value);
			}

			if (set.size() != hp.size()) {
				flag = false;
			}
		}
		;

		return flag;

	}

	public static void main(String[] args) {

		WordPattern wp = new WordPattern();
		System.out.println(wp.wordPattern("aaa", "aa aa aa aa"));
	}

}
