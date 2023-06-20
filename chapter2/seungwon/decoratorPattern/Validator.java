package tmp.decoratorPattern;

public class Validator implements DataProcessor {
	private final DataProcessor dataProcessor;

	public Validator(DataProcessor dataProcessor) {
		this.dataProcessor = dataProcessor;
	}

	@Override
	public void process() {
		dataProcessor.process();
		validateData();
	}

	private void validateData() {
		if (dataProcessor.getData().isEmpty() || dataProcessor.getData().isBlank()) {
			System.out.println("데이터가 유효하지 않습니다.");
		} else {
			System.out.println("데이터가 유효합니다.");
		}
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
