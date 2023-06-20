package tmp.decoratorPattern;

public class Saver implements DataProcessor {
	private final DataProcessor dataProcessor;
	private String data;

	public Saver(DataProcessor dataProcessor) {
		this.dataProcessor = dataProcessor;
	}

	@Override
	public String getData() {
		return data;
	}

	@Override
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void process() {
		dataProcessor.process();
		setData(dataProcessor.getData());
	}
}
