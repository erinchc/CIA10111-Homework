package hw4;

public class Homework4_4 {
	public static void main(String[] args) {

		// 班上有8位同學,他們進行了6次考試，算出每位同學考最高分的次數

		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] highestCount = new int[8];

		for (int exam = 0; exam < scores.length; exam++) {
			int maxScore = 0;
			int maxIndex = 0;

			// 找每次考試的最高分與該學生索引值
			for (int student = 0; student < scores[exam].length; student++) {
				if (scores[exam][student] > maxScore) {
					maxScore = scores[exam][student];
					maxIndex = student;
				}
			}

			// 更新該學生的最高分次數
			highestCount[maxIndex] = highestCount[maxIndex] + 1;
		}

		for (int i = 0; i < highestCount.length; i++) {
			System.out.println((i + 1) + "號: " + highestCount[i] + "次");
		}

	}
}
