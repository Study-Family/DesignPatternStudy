package tmp.decoratorPattern;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		DataProcessor dataProcessor = new OutputProcessor(
				new Decryptor(new OutputProcessor(new Saver(new Encryptor(new Validator(new InputProcessor()))))));

		dataProcessor.process();
	}
}
