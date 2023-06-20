package tmp.decoratorPattern;

public class Encryptor implements DataProcessor {
	private final DataProcessor dataProcessor;

	public Encryptor(DataProcessor dataProcessor) {
		this.dataProcessor = dataProcessor;
	}

	@Override
	public void process() {
		dataProcessor.process();
		encryptData();
	}

	private void encryptData() {
		String data = dataProcessor.getData();
		StringBuilder encryptedData = new StringBuilder();
		for (int i = data.length() - 1; i >= 0; i--) {
			encryptedData.append(data.charAt(i));
		}
		dataProcessor.setData(encryptedData.toString());
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
