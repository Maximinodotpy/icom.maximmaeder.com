package ch.fhnw.prog1.exercise.maxsubsequence;

public class MaxSubProblem {

	public int maxSub(int[] data){
		int highest = 0;

		for (int i = 0; i < data.length; i++) {
			int start = data[i];
			int end = data[i];

			for (int j = i; j < data.length; j++) {
				end += data[j];

				int difference = end - start;
				if (difference > highest) {
					highest = difference;
				}
			}
		}

        return Integer.max(highest, 0);
	}
}
