package org.vouk.reunion;

import org.apache.commons.text.WordUtils;

public class Greeter {
  
  public static String sanitizeName(String name) {
    // "  heLLo   MaRY  Jane" => "Hello Mary Jane"
    // remove redundant middle spaces, remove spaces from beginning/end
    // sanitize case
    // throw an exception if non-letters are present
    return WordUtils.capitalize(name.trim().toLowerCase().replaceAll("\\s+", " "));
  }
  
  public static String greet(String name) {
    return "Hello " + sanitizeName(name) + "!";
  }
}
