package chapter7.facade;

import chapter7.facade.model.Buffer;
import chapter7.facade.model.Result;
import chapter7.facade.subsystem.AudioMixer;
import chapter7.facade.subsystem.BitrateReader;
import chapter7.facade.subsystem.Codec;
import chapter7.facade.subsystem.CodecFactory;
import chapter7.facade.subsystem.File;
import chapter7.facade.subsystem.MPEG4CompressionCodec;
import chapter7.facade.subsystem.OggCompressionCodec;
import chapter7.facade.subsystem.VideoFile;

public class VideoConverter {

	public File convertVideo(String filename, String format) {
		File file = new VideoFile(filename);
		Codec sourceCodec = (new CodecFactory()).extract(file);
		Codec destinationCodec = null;

		if ( format == "mp4") {
			destinationCodec = new MPEG4CompressionCodec();
		} else {
			destinationCodec = new OggCompressionCodec();
		}

		Buffer buffer = BitrateReader.read(filename, sourceCodec);
		Result result = BitrateReader.convert(buffer, destinationCodec);
		result = (new AudioMixer()).fix(result);
		return new File(result);
	}
}
