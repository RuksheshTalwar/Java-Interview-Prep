package interview.questions.optional;

import java.util.Optional;

public class OptionalUnderstanding {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hello, World!");
        Optional<String> emptyOptional = Optional.empty();  // Empty Optional
        Optional<String> nullableOptional = Optional.ofNullable(null);  // Can be null or non-null
        System.out.println(nullableOptional.get());

    }
}
