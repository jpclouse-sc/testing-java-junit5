package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest implements ModelTests {

    /**
     * Test assertions can be nested. In this case, Owner extends Person, and we want to
     * test the assignment of the members of both Owner and Person.
     */
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Greenville");
        owner.setTelephone("1234567");

        assertAll("Preperties Test",
                () -> assertAll("Person Properties",
                      () -> assertEquals("Joe", owner.getFirstName(), "First name"),
                      () -> assertEquals("Buck", owner.getLastName(), "Last name")),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Greenville", owner.getCity(), "City"),
                        () -> assertEquals("1234567", owner.getTelephone(), "Telephone"))
        );

        // Hamcrest assertion
        assertThat(owner.getCity(), Matchers.is("Greenville"));
    }

}
