package org.java.oop.logic;

import java.util.ArrayList;
import java.util.List;

// 두 타입이 어느 쪽이 크고 작은가 비교하기 위한 클래스 Comparable 상속하는 것 -> String, Integer
public class BubbleSort<T extends Comparable<T>> {
	public List<T> sort(List<T> input) {
		List<T> output = new ArrayList<T>(input);

		for (int i = output.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (output.get(j).compareTo(output.get(j + 1)) > 0) {
					T temp = output.get(j);
					output.set(j, output.get(j + 1));
					output.set(j + 1, temp);
				}
			}
		}

		return output;
	}
}
