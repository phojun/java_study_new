package ch53.objectclassstringbuilder;

public class StringTextBlock {
	//문자열을 """ """ 사이에 이어서 만들 수 있음
	//html, json 문자열을 만드는데 유용하게 사용할 수 있음
	
	public static String getBlockOfHtml() {
	    return """
	            <html>

	                <body>
	                    <span>example text</span>
	                </body>
	            </html>""";
	
}
	
	public static void main(String[] args) throws ClassNotFoundException {
		String textBlocks = """ 
				Hi,
				how r u,
				helloJava
				""";
		System.out.println(textBlocks);
		
		System.out.println(getBlockOfHtml());
		
	}

}
