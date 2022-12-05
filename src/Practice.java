import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ', opt = ' ';
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 점수는 몇 점인가요?");
		
		score = scanner.nextInt();
		System.out.println("당신의 점수는 " + score + "점 입니다.");
		
		
		
		if(score >= 90) 
		{
			grade = 'A';
			
			if(score >= 96) {
				opt = '+';
			}
			else if(score < 93)
			{
				opt = '-';
			}
			}
		else if(score >= 80)
		{
			grade = 'B';
			
			if(score >= 87)
			{
				opt = '+';
			}
			else if(score < 83)
			{
				opt = '-';
			}
		}
			else
		{
			grade = 'C';
			
		}
			System.out.println("당신의 학점은 " + grade + opt + "입니다.");
		}
}
