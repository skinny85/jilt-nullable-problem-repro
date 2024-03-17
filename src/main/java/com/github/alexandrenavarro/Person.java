package com.github.alexandrenavarro;

import lombok.*;
import org.jilt.Builder;
import org.jilt.BuilderStyle;
import org.jspecify.annotations.Nullable;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@EqualsAndHashCode
@ToString
@Builder(style = BuilderStyle.STAGED)
public final class Person {
    private final String firstName;
    private final String lastname;

    @Nullable // Bug does not work in jilt.Builder
    private final String jspecifyNullableMiddleName;

    @jakarta.annotation.Nullable // works in jilt.Builder
    private final String jakartaNullableMiddleName;

}
