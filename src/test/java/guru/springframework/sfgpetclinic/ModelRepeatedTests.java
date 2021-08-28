package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

/**
 * This is a JUnit interface. It merely adds a @Tag("model"). The nodel test classes will
 * implement this interface to include them in the Model Tests run configuration.
 */
@Tag("repeated")
public interface ModelRepeatedTests {

    /**
     * Using RepetitionInfo here causes any tests that don't use repetition to fail. In
     * this case, it should be handled in the test class itself and not in this interface.
     * Or better yet, Put the repeated tests in their own test class that implements ModelTests.
     */
    @BeforeEach
    default void beforeEachConsoleOutputter(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test - " + testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition() + " | " + repetitionInfo.getTotalRepetitions());
    }
}
