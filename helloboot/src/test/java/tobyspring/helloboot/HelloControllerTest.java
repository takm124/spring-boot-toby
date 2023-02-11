package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    @Test
    void helloController() {
        HelloController helloController = new HelloController(name -> name);

        String ret = helloController.hello("Test");

        Assertions.assertThat(ret).isEqualTo("Test");
    }

    @Test
    void failsHelloController() {
        HelloController helloController = new HelloController(name -> name);

        Assertions.assertThatThrownBy(() -> {
            helloController.hello(null); // null 일때
        }).isInstanceOf(IllegalStateException.class);

        Assertions.assertThatThrownBy(() -> {
            helloController.hello(""); // 빈 문자열일때
        }).isInstanceOf(IllegalStateException.class);

    }
}
