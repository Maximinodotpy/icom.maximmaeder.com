/*
 * Created on 21.03.2014
 */
package ch.fhnw.prog1.exercise.sortalgs;

import ch.fhnw.algd.sortdemo.framework.SortAlg;
import ch.fhnw.algd.sortdemo.framework.SortData;

public class InsertionSort implements SortAlg {
	@Override
	public void run(SortData data) {
		for (int start_i = 1; start_i < data.size(); start_i++) {
			int target_i = start_i - 1;
			int k = start_i;

			while (target_i >= 0 && data.less(k, target_i)) {
				data.swap(k, target_i);
				target_i--;
				k--;
			}
		}
	}
}
