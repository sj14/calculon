/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Calculon;

import io.github.sj14.calculon.Calculon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        Calculon classUnderTest = new Calculon();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
