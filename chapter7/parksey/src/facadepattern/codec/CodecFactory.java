package facadepattern.codec;

import facadepattern.converter.File;

public class CodecFactory {

    public Codec extract(File file) {
        return new BaseCodec();
    }
}
