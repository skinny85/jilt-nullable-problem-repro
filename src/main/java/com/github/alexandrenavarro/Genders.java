package com.github.alexandrenavarro;

import org.jspecify.annotations.Nullable;

public final class Genders {

    @Nullable
    public static Gender mapToGender(String s) {
        return switch (s) {
            case "male" -> Gender.MALE;
            case "female" -> Gender.FEMALE;
            case null, default -> null;
        };
    }

}
