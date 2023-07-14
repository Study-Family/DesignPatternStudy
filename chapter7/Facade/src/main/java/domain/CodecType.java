package domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum CodecType {
    OGG_COMPRESSION("ogg"), MPEG4_COMPRESSION("mpeg4");

    private final String codecName;
    private static final Map<String, CodecType> CODECTYPE_MAP = Collections.unmodifiableMap(Arrays.stream(CodecType.values())
            .collect(Collectors.toMap(CodecType::getCodecName, Function.identity())));


    CodecType(String codecName) {
        this.codecName = codecName;
    }

    public static CodecType getCodecType(String codecName) {
        return CODECTYPE_MAP.get(codecName);
    }

    public String getCodecName() {
        return codecName;
    }
}
