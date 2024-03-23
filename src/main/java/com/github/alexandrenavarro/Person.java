package com.github.alexandrenavarro;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.jilt.Builder;
import org.jilt.BuilderStyle;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@EqualsAndHashCode
@ToString
@Builder(style = BuilderStyle.STAGED)
public final class Person {
    private final String firstName;
    private final String lastname;

    @org.jspecify.annotations.Nullable // fixed in Jilt 1.5
    private final String jspecifyNullableMiddleName;

    @jakarta.annotation.Nullable // works in jilt.Builder
    private final String jakartaNullableMiddleName;
}
