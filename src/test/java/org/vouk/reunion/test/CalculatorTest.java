package org.vouk.reunion.test;

import org.testng.annotations.*;
import org.vouk.reunion.Calculator;

public class CalculatorTest {

  Calculator calc;
  
  @BeforeTest
  public void initCalculator() {
    this.calc = new Calculator();
  }
  
  @Test
  public void testAdd() {
    assert this.calc.add(4,4) == 8;
  }
  
}
