package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;

/**
 * This is a JUnit interface. It merely adds a @Tag("model"). The nodel test classes will
 * implement this interface to include them in the Model Tests run configuration.
 */
@Tag("model")
public interface ModelTests {
}
