package com.example.spike;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    public void learning() {
        List<Integer> numbers = Arrays.asList(12, 15,45);

        assertThat(numbers)
                .hasSize(3)
                .contains(12)
                .allMatch(x -> x > 10)
                .allMatch(x -> x < 100)
                .noneMatch(x -> x < 0);

        assertThat("").isEmpty();
        assertThat("ABCDEF").contains("BCD").startsWith("ABC").endsWith("DEF");
//        assertThat(numbers, hasSize(3));
//        assertThat(numbers, hasItems(12, 45));
//        assertThat(numbers, everyItem(greaterThan(10)));
//        assertThat(numbers, everyItem(lessThan(1000)));
//        assertThat("", isEmptyString());
//        assertThat("ABCDEF", containsString("BCD"));
//        assertThat("ABCDEF", startsWith("ABCD"));
//        assertThat("ABCDEF", endsWith("DEF"));
    }
}
