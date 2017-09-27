package org.vouk.reunion.test;

import org.testng.Assert;
import org.testng.annotations.*;
import org.vouk.reunion.Greeter;

public class GreeterTest {

  @Test
  public void testUpperCase() {
    Assert.assertEquals(Greeter.greet("KASIA"), "Hello Kasia!");
  }

  @Test
  public void testLowerCase() {
    Assert.assertEquals(Greeter.greet("kasia"), "Hello Kasia!");
  }

  @Test
  public void testMixedCaseWords() {
    Assert.assertEquals(Greeter.greet("maRZenA  l. koWAlSka"), "Hello Marzena L. Kowalska!");
  }

  @Test
  public void testMiddleSpaces() {
    Assert.assertEquals(Greeter.greet("Maria  Magdalena"), "Hello Maria Magdalena!");
  }

  @Test
  public void testLeadingSpaces() {
    Assert.assertEquals(Greeter.greet("  Kasia"), "Hello Kasia!");
  }

  @Test
  public void testTrailingSpaces() {
    Assert.assertEquals(Greeter.greet("Kasia  "), "Hello Kasia!");
  }
}
