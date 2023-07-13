package tmp.decoratorPattern;

import java.util.Scanner;

public class InputProcessor implements DataProcessor {
	private final Scanner SCANNER = new Scanner(System.in);
	private final String DELIMITER = "|";
	private String data;

	@Override
	public void process() {
		System.out.print("이름을 입력하세요: ");
		String name = SCANNER.next();
		System.out.print("전화번호를 입력하세요: ");
		String phoneNumber = SCANNER.next();
		System.out.print("주소를 입력하세요: ");
		String address = SCANNER.next();

		data = name + DELIMITER + phoneNumber + DELIMITER + address;
		SCANNER.close();
	}

	@Override
	public String getData() {
		return data;
	}

	@Override
	public void setData(String data) {
		this.data = data;
	}
}
