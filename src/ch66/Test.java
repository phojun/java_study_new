package ch66;
/*
 * 내부클래스를 사용하는 이유

외부 클래스와 내부 클래스가 긴밀한 관계를 맺을 때 사용한다.
내부 클래스에서 외부 클래스의 멤버에 쉽게 접근할 수 있다.
서로 관련있는 코드를 묶어서 코드의 캡슐화를 증가시킨다.
외부에서는 내부 클래스에 접근할 수 없기 때문에 코드의 복잡성을 줄일 수 있다.

*/
public class Test {
	
	void myTest() {
		System.out.println("외부클래스 메서드!!");
	}

	class InnerClass {
        // InnerClass
		void innerClassMethod() {
			Test.this.myTest();
		}
    }

    static class InnerStaticClass {
        // static InnerClass
    	void innerClassMethod() {
			//Test.this.myTest(); -> 컴파일 오류 이유: 스태틱 내부 클래스는 Test객체 생성 전에도 접근할 수 있기
    		//때문에 Test객체가 생성되어야 사용할 수 있는 메서드인 myTest()를 참조할 수 없다. 
		}
    }

    public static void main(String[] args) {
    	// InnerClass 클래스의 객체를 만들기 위해서는 Test 클래스의 객체를 먼저 만들어야 한다. 
    	//따라서 new 연산자를 두번 사용하여 외부 클래스에 대한 인스턴스를 이용해서 내부 클래스의 인스턴스를 생성
    	
        Test.InnerClass innerClass1 = new Test().new InnerClass();
        Test.InnerClass innerClass2 = new Test().new InnerClass();

        if (innerClass1 == innerClass2) {
            System.out.println("내부 클래스는 같은 참조");
        } else {
            System.out.println("내부 클래스는 다른 참조");
        }
        
        //static 이기 때문에 외부클래스(Test)의 객체를 만들지 않고 InnerStaticClass를 사용할 수 있다
        Test.InnerStaticClass innerClass3 = new Test.InnerStaticClass();
        Test.InnerStaticClass innerClass4 = new Test.InnerStaticClass();
        
        if (innerClass3 == innerClass4) {
            System.out.println("내부 클래스는 같은 참조");
        } else {
            System.out.println("내부 클래스는 다른 참조");
        }
    }
}
