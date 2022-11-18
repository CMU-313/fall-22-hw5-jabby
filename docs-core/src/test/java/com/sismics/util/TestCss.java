package com.sismics.util;

import com.sismics.util.css.Selector;
import org.junit.Test;

/**
 * Test of CSS utilities.
 *
 * @author bgamard
 */
public class TestCss {
  @Test
  public void testBuildCss() {
    Selector selector =
        new Selector(".test").rule("background-color", "yellow").rule("font-family", "Comic Sans");
    System.out.println(selector);
  }
}
