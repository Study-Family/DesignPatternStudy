package chapter7.facade.subsystem;

public class CodecFactory {
	public Codec extract(File file) {
		return new NormalCodec();
	}
}
