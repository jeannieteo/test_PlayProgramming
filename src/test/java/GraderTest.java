import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test_PlayProgramming.Grader;

class GraderTest {

	@Test
	void test_edge_F() {
		Grader grader = new Grader();
		assertEquals('F', grader.determine_LetterGrade(49));
	}
	@Test
	void test_edge_E() {
		Grader grader = new Grader();
		assertEquals('E', grader.determine_LetterGrade(64));
	}
	@Test
	void test_edge_D() {
		Grader grader = new Grader();
		assertEquals('D', grader.determine_LetterGrade(74));
	}
	@Test
	void test_edge_C() {
		Grader grader = new Grader();
		assertEquals('C', grader.determine_LetterGrade(79));
	}
	@Test
	void test_edge_B() {
		Grader grader = new Grader();
		assertEquals('B', grader.determine_LetterGrade(89));
	}
	@Test
	void test_edge_A() {
		Grader grader = new Grader();
		assertEquals('A', grader.determine_LetterGrade(100));
	}
	
	@Test
	void test_edge_Negative() {
		Grader grader = new Grader();
		assertThrows(IllegalArgumentException.class, () -> {grader.determine_LetterGrade(-1);} );
	}
	
	@Test
	void test_edge_Zero() {
		Grader grader = new Grader();
		assertThrows(IllegalArgumentException.class, () -> {grader.determine_LetterGrade(0);} );
	}
}
