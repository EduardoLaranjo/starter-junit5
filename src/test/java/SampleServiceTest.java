import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleServiceTest {

  @Test
  void someMethod() {
    var sampleService = new SampleService();
    Assertions.assertEquals(true, sampleService.someMethod());
  }
}