package com.github.alexandrenavarro;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void person_has_both_nullable_properties_as_optional() {
        PersonBuilder.person()
                .firstName("First")
                .lastname("Last")
                .jspecifyNullableMiddleName("middleName1")
                .build();
    }
}
