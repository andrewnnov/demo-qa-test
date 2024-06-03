import org.junit.jupiter.api.*;

public class JunitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("beforeEach");
    }

    @Test
    void firstTest() {
        System.out.println("firstTest");
    }

    @Test
    void secondTest() {
        System.out.println("secondTest");
    }

    @AfterEach
    void tearDown() {
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterFll");
    }
}
