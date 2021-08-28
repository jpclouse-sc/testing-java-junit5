package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;
import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class PersonRepeatedTests implements ModelRepeatedTests {

    /**
     * The @RepeatedTest() annotation has a name argument that will be output when the iterations run.
     * The name is a constant from the RepeatedTest interface.
     */
    @RepeatedTest(name = RepeatedTest.LONG_DISPLAY_NAME, value = 10)
    @DisplayName("My repeated test")
    void myRepeatedTest() {
        // TODO: implement me
    }

    @RepeatedTest(5)
    @DisplayName("Repetition with DI")
    void myRepeatedTestWithDependencyInjection(TestInfo testInfo, RepetitionInfo repititionInfo) {
        //System.out.println(testInfo.getDisplayName() + ": " + repititionInfo.getCurrentRepetition());
    }

    @RepeatedTest(name = RepeatedTest.DISPLAY_NAME_PLACEHOLDER + ": " + RepeatedTest.CURRENT_REPETITION_PLACEHOLDER, value = 5)
    @DisplayName("Repetition with DI from ModelTest interface")
    void myRepeatedTestWithDependencyInjection2(TestInfo testInfo, RepetitionInfo repititionInfo) {

    }
}
