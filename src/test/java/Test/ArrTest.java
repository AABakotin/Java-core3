package Test;


import lessons6.Method;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



class ArrTest {
    @ParameterizedTest
    @MethodSource("ArrTest")
    void mainTestArr(int[] in, int [] out) {
        Assertions.assertArrayEquals(out, Method.copyArr(in));
    }

    static Stream<Arguments> ArrTest() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[] {1,5,4,8,2,1,4,8,6,4,5,77,1}, new int[] {5,77,1}));
        list.add(Arguments.arguments(new int[] {5,6,8,7,4}, new int[] {}));
        list.add(Arguments.arguments(new int[] {1,5,4,8,2,1,4,8,6,5,77,1}, new int[] {8,6,5,77,1}));
        return list.stream();
    }

    @Test
    void testSliceException() {
        Assertions.assertThrows(RuntimeException.class, () -> Method.copyArr(new int[] {1,3,5}));
    }

    @Test
    void fourOneTest() {
        Assertions.assertTrue(Method.fourOne(new int[] {1,1,1,4,4,4,1}));
    }
}