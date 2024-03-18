package com.github.alexandrenavarro;

import org.jspecify.annotations.Nullable;

public final class Genders {
    @Nullable
    public static Gender mapToGender(String s) {
        switch (s) {
            case "male": return Gender.MALE;
            case "female": return Gender.FEMALE;
            default: return null;
        }
    }
}
