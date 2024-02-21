import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class SomeTest {

    @Test
    public void test() {
        print("Hello world!");
    }

    @Step("Print the given message")
    private void print(String message) {
        System.out.println(message);
    }
}
