package org.java.oop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

	@DisplayName("버블 소트")
	@Test
	void test() {
		// Given
		BubbleSort<Integer> bubbleSort = new BubbleSort<>();

		// When
		List<Integer> actual = bubbleSort.sort(List.of(3, 2, 5, 4, 1));

		// Then
		assertEquals(List.of(1, 2, 3, 4, 5), actual);
	}

}