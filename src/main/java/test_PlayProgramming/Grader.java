package test_PlayProgramming;

public class Grader {
	
	public char determine_LetterGrade (int numberGrade)	{
		if(numberGrade < 0)	{
			throw new IllegalArgumentException("Number Grader cannot be less than 0.");
		}
		else if(numberGrade < 50)	{
			return'F';
		}
		else if(numberGrade < 65)	{
			return'E';
		}
		else if(numberGrade < 75)	{
			return'D';
		}
		else if(numberGrade < 80)	{
			return'C';
		}
		else if(numberGrade < 90)	{
			return'B';
		}
		else if(numberGrade <= 100)	{
			return'A';
		}
		return 0;
		
	}

}
