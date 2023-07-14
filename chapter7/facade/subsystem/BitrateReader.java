package chapter7.facade.subsystem;

import chapter7.facade.model.Buffer;
import chapter7.facade.model.Result;

public final class BitrateReader {

	private BitrateReader() {

	}
	public static Buffer read(String filename, Codec codec) {
		return new Buffer();
	}
	public static Result convert(Buffer buffer, Codec destinationCodec) {
		return new Result();
	}
}
