package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

/**
 * This is a JUnit interface. It adds a @Tag("controller"). The controller test classes will
 * implement this interface to include them in the Controller Tests run configuration.
 *
 * @TestInstance tags this interface as part of the per-class lifecycle. It is required to have
 * the default void beforeAll() method, which executes before-all in the test classes tagged as
 * "controller".
 *
 * When you have a group of tests with patters that repeat for each test in the group, add a
 * default method for them here.
 */
@Tag("controller")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ControllerTests {

    @BeforeAll
    default void beforeAll() {
        System.out.println("Let's do domething here");
    }
}
