package ch11;

public class MakeReport {
	StringBuffer buffer = new StringBuffer(); // 늘어나는 버퍼, 문자열 변경에 유리
	
	private String line = "=======================================\n";
	private String title = "  이름\t   주소 \t\t  전화번호   \n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generatBody() {
		buffer.append("James \t");
		buffer.append("Seoul, Korea \t");
		buffer.append("010-1234-5678 \n");
		
		buffer.append("Mary \t");
		buffer.append("NewYork, US \t");
		buffer.append("010-1111-2222 \n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generatBody();
		makeFooter();
		return buffer.toString();
	}
}
