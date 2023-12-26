package study;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setup() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @DisplayName("Set에 저장되있는 숫자인지 아닌지 확인하여 boolean을 반환한다.")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    public void givenNumbers_whenSetContainingNumber_thenReturnBoolean(int input) {
        boolean hasNumber = numbers.contains(input);
        assertTrue(hasNumber);
    }

}
