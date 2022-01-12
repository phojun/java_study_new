package ch37.example.ArrayListTest;

import java.util.InputMismatchException;
import java.util.Scanner;

/*1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
Lee 학생은 국어 100점, 수학 50점입니다. 
Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요
1일차 - 입력받아 계산하는 것으로 수정(완료)
2일차 - 학생도 ArrayList로 받아 등록된 학생들의 정보를 출력하는 기능 만들 예정(미완)
*
*/
public class MainTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int score;
		String subject;
		int plusSubject;
		int count = 0;

		while (true) {

			while (true) {
				try {
					System.out.println("학생을 등록하시겠습니까?(1:예 2:아니오)");
					input = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					sc = new Scanner(System.in);
					System.out.println("정수만 입력해주세요");
					System.out.println("학생을 등록하시겠습니까?(1:예 2:아니오)");

				}
			}

			if (input == 1) {
				System.out.print("학생의 이름을 입력해 주세요 : ");
				String name = sc.next();
				
				if (name != null) {
					Student s = new Student(name);
					
					while(true) {
						
						while (true) {
							System.out.println("학생이 수강한 과목과 성적을 입력해주세요");
							System.out.print("과목 : ");
							subject = sc.next();

							while (true) {
								
								try {
									System.out.print("점수 : ");
									score = sc.nextInt();
									break;
								} catch (InputMismatchException e) {
									sc = new Scanner(System.in);
									System.out.println("0~100까지의 정수만 입력해주세요");
								}
								
							}
							
							if (score >= 0 && score <= 100) {
								s.addSubject(subject, score);
								break;
							} else {
								System.out.println("0~100까지의 정수만 입력해주세요");
							}

							
						}
						
						while(true) {
							try {
								System.out.println("성적을 추가로 입력하시겠습니까? (예:1, 아니오:2)");
								plusSubject=sc.nextInt();
								break;
							}catch(Exception e) {
								sc=new Scanner(System.in);
								System.out.println("1과 2중 선택하여 입력해주세요");
							}
						}
						
						if(plusSubject==2) {
							break;
						}else if (plusSubject==1) {
							
						}else {
							count++;
							if (count >= 10) {
								System.out.println("10회 오류로 자동 종료됩니다.");
								break;
							} else {
								System.out.println("1과 2중 하나만 입력해주세요 " + count + "회 오류(10회 오류시 종료됩니다.)");
							}
						}

					}
					s.showInfo();
				} else {
					System.out.println("학생의 이름을 입력해주세요");
					break;
				}
			} else if (input == 2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				count++;
				if (count >= 10) {
					System.out.println("10회 오류로 자동 종료됩니다.");
					break;
				} else {
					System.out.println("1과 2중 하나만 입력해주세요 " + count + "회 오류(10회 오류시 종료됩니다.)");
				}
			}

		}
		sc.close();
	}

}
