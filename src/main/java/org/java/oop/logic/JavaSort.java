package org.java.oop.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class JavaSort<T extends Comparable<T>> {

	public List<T> sort(List<T> input) {
		List<T> output = new ArrayList<T>(input);

		Collections.sort(output);

		return output;
	}

}
