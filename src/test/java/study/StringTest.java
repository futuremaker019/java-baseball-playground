package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @DisplayName("split")
    @Test
    public void split() {
        // given
        String actual = "1,2";

        // when
        String[] split = actual.split(",");

        // then
        assertThat(split).contains("1");
        assertThat(split).containsExactly("1", "2");
    }

    @DisplayName("주어진 String의 charAt의 값을 얻어낸다.")
    @Test
    public void givenStringValue_whenChoosingIndexByCharAt_thenReturnCharValue() {
        // given
        String actual = "abc";

        // when
        char c = actual.charAt(1);

        // then
        assertThat(c).isEqualTo('b');
    }

    @DisplayName("'(1,2)' 값을 '(',')'을 제거하고 '1,2'를 반환한다.")
    @Test
    public void givenStringNumberWithParentheses_whenRemoveParentheses_thenReturnStringNumbers() {
        // given
        String actual = "(1,2)";

        // when
        String result = actual.substring(1, actual.length() - 1);

        // then
        assertThat(result).isEqualTo("1,2");
    }

    @DisplayName("문자열의 범위를 벗어난 인덱스를 선택시 StringIndexOutOfBoundsException 을 발생시킨다.")
    @Test
    public void givenStringValue_whenChoosingIndexOutOfBound_thenThrowException() {
        // given
        String actual = "abc";

        // when


        // then
        assertThatThrownBy(() -> actual.charAt(5))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 5");
    }
}
