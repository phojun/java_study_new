package ch59.generic.textends;

public class GenericPrinter<T extends Material> {//<T>는 제네릭 타입을 쓰겠단 뜻(TypeParameter) static 변수는 사용할 수 없음
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
	
	public void printing() {
		material.doPrinting();
	}
	
}
