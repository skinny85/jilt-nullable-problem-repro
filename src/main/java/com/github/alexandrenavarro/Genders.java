package com.github.alexandrenavarro;

import org.jspecify.annotations.Nullable;

public final class Genders {
    @Nullable
    public static Gender mapToGender(String s) {
        if (s.equals("male")) {
            return Gender.MALE;
        } else if (s.equals("female")) {
            return Gender.FEMALE;
        } else {
            return null;
        }
    }
}
