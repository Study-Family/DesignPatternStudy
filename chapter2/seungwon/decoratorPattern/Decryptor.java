package tmp.decoratorPattern;

public class Decryptor implements DataProcessor {
	private final DataProcessor dataProcessor;

	public Decryptor(DataProcessor dataProcessor) {
		this.dataProcessor = dataProcessor;
	}

	@Override
	public void process() {
		dataProcessor.process();
		decryptData();
	}

	private void decryptData() {
		String data = dataProcessor.getData();
		StringBuilder decryptedData = new StringBuilder();
		for (int i = data.length() - 1; i >= 0; i--) {
			decryptedData.append(data.charAt(i));
		}
		dataProcessor.setData(decryptedData.toString());
	}

	@Override
	public String getData() {
		return dataProcessor.getData();
	}

	@Override
	public void setData(String data) {
		dataProcessor.setData(data);
	}
}
