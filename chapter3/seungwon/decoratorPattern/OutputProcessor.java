package tmp.decoratorPattern;

public class OutputProcessor implements DataProcessor {
	private final DataProcessor dataProcessor;

	public OutputProcessor(DataProcessor dataProcessor) {
		this.dataProcessor = dataProcessor;
	}

	@Override
	public String getData() {
		return dataProcessor.getData();
	}

	@Override
	public void setData(String data) {
		dataProcessor.setData(data);
	}

	@Override
	public void process() {
		dataProcessor.process();
		System.out.println(">> 데이터 : " + dataProcessor.getData());
	}
}
