package ch59.generic.nongeneric;

public class ThreeDPrinter2 {
	
	private Object material;

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}

	public String toString() {
		return "재료는 Object 입니다";
	}

}
