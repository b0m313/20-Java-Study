// practice problem 3-10
// 2차원 배열로 4년 평점 구하기
// 2차원 배열에 학년 별로 1,2학기 성적으로 저장하고 4년간 전체 평점 평균 출력하는 프로그램

public class practiceProblem3_10_ScoreAverage
{
	public static void main(String[] args)
	{
		//1학년 1학기 ~ 4학년 2학기 평점
		double score[][] = {{3.3, 3.4},{3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		
		double sum = 0;
		
		//각 학년별로 반복
		for(int year = 0; year < score.length; year++)
		{
			//각 학년의 학기별로 반복
			for(int term = 0; term < score[year].length; term++)
			{
				//전체 평점 합
				sum += score[year][term];
			}
		}
		//배열의 행 개수 -> 4
		int n = score.length;
		//배열의 열 개수 -> 2
		int m = score[0].length;

		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
	}
}