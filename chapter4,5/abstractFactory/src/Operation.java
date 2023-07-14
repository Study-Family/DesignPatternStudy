import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Operation {
    WINDOW("window"), MAC("mac");

    private final String os;
    private final static Map<String, Operation> OPERATION_MAP = Collections.unmodifiableMap(Arrays.stream(values())
            .collect(Collectors.toMap(Operation::getOs, Function.identity())));

    Operation(String os) {
        this.os = os;
    }

    public String getOs() {
        return this.os;
    }

    public static Optional<Operation> findOperation(String os) {
        return Optional.ofNullable(OPERATION_MAP.get(os));
    }
}
