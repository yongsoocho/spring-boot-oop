package org.java.oop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

	@DisplayName("자바소트")
	@Test
	void test() {
		// Given
		JavaSort<Integer> bubbleSort = new JavaSort<>();

		// When
		List<Integer> actual = bubbleSort.sort(List.of(3, 2, 5, 4, 1));

		// Then
		assertEquals(List.of(1, 2, 3, 4, 5), actual);
	}

}