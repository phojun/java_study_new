package ch59.generic;

/*- 클래스에서 사용하는 변수의 자료형이 여러개 일수 있고, 그 기능(메서드)은 동일한 경우 클래스의 자료형을 특정하지 않고
추후 해당 클래스를 사용할 때 지정 할 수 있도록 선언

- 실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식
- 컬렉션 프레임워크에서 많이 사용되고 있음*/


public class GenericPrinter<T> {//<T>는 제네릭 타입을 쓰겠단 뜻(TypeParameter) static 변수는 사용할 수 없음
	//<T>에서 <>를 다이아몬드 연산자라 함

	private T material;//E : element, K: key, V : value 등 여러 알파벳을 의미에 따라 사용 가능

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	
}
