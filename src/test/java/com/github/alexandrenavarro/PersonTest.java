package com.github.alexandrenavarro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PersonTest {
    @Test
    void person_has_both_nullable_properties_as_optional() {
        Person person = PersonBuilder.person()
                .firstName("First")
                .lastname("Last")
                // optional because of JSpecify's @Nullable
//                .jspecifyNullableMiddleName("middleName1")
                // optional because of Jakarta's @Nullable
//                .jakartaNullableMiddleName("middleName2")
                .build();

        assertEquals("First", person.getFirstName());
        assertEquals("Last", person.getLastname());
        assertNull(person.getJspecifyNullableMiddleName());
        assertNull(person.getJakartaNullableMiddleName());
    }
}
