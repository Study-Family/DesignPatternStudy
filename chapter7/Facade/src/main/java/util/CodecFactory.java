package util;

import domain.CodecType;
import domain.VideoFile;

public class CodecFactory {

    public static CodecType extractFrom(VideoFile file) {
        return file.getCodecType();
    }
}
