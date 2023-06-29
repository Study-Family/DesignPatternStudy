package facadepattern.converter;

import facadepattern.codec.Codec;
import facadepattern.codec.CodecFactory;
import facadepattern.codec.MPEG4CompressionCodec;
import facadepattern.codec.OggCompressionCodec;

public class VideoConverter {

    public File convertVideo(String filename, String format) {
        File file = new VideoFile(filename);
        Codec sourceCodec = new CodecFactory().extract(file);
        Codec destinationCodec = findCodecByForamt(format);

        BitrateReader bitrateReader =new BitrateReader();
        byte[] buffer = bitrateReader.read(filename, sourceCodec);
        byte[] result = bitrateReader.convert(buffer, destinationCodec);

        return new File(new AudioMixer().fix(result));
    }

    public Codec findCodecByForamt(String format) {
        if (format.equals("mp4")) {
            return new MPEG4CompressionCodec();
        }

        return new OggCompressionCodec();
    }
}
