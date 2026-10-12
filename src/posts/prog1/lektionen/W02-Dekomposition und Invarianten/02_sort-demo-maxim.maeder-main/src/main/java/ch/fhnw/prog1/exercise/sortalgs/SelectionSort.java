/*
 * Created on 21.03.2014
 */
package ch.fhnw.prog1.exercise.sortalgs;

import ch.fhnw.algd.sortdemo.framework.SortAlg;
import ch.fhnw.algd.sortdemo.framework.SortData;

public class SelectionSort implements SortAlg {
	@Override
	public void run(SortData data) {
		for (int start_i = 0; start_i < data.size(); start_i++) {
			int current_smallest_i = -1;

			for (int i = start_i; i < data.size(); i++) {
				if (current_smallest_i == -1 || data.less(i, current_smallest_i)) {
					current_smallest_i = i;
				}
			}

			data.swap(start_i, current_smallest_i);
		}
	}
}