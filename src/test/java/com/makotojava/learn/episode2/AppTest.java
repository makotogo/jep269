package com.makotojava.learn.episode2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

  private static final Logger log = Logger.getLogger(AppTest.class.getName());

  private App classUnderTest;

  @Before
  public void setUp() throws Exception {
    classUnderTest = new App();
  }

  @Test
  public void testTheOldList() {
    performListAssertions(classUnderTest.theOldList(), "testTheOldList");
  }

  // Uncomment for JDK 9 Stuff
  // @Test
  // public void testTheNewList() {
  // performListAssertions(classUnderTest.theNewList(), "testTheNewList");
  // }

  private void performListAssertions(List<String> theList, String testName) {
    assertNotNull(theList);
    assertEquals(5, theList.size());
    assertEquals("Lorem", theList.get(0));
    assertEquals("ipsum", theList.get(1));
    assertEquals("dolor", theList.get(2));
    assertEquals("sit", theList.get(3));
    assertEquals("amet", theList.get(4));
    log.info(testName + ":" + Arrays.toString(theList.toArray()));
  }

  @Test
  public void testTheOldSet() {
    performSetAssertions(classUnderTest.theOldSet(), "testTheOldSet");
  }

  // Uncomment for JDK 9 Stuff
  // @Test
  // public void testTheNewSet() {
  // performSetAssertions(classUnderTest.theNewSet(), "testTheNewSet");
  // }

  private void performSetAssertions(Set<String> theSet, String testName) {
    assertNotNull(theSet);
    assertEquals(5, theSet.size());
    assertTrue(theSet.contains("Lorem"));
    assertTrue(theSet.contains("ipsum"));
    assertTrue(theSet.contains("dolor"));
    assertTrue(theSet.contains("sit"));
    assertTrue(theSet.contains("amet"));
    log.info(testName + ":" + Arrays.toString(theSet.toArray()));
  }

  @Test
  public void testTheOldMap() {
    performMapAssertions(classUnderTest.theOldMap(), "testTheOldMap");
  }

  // Uncomment for JDK 9 Stuff
  // @Test
  // public void testTheNewMap() {
  // performMapAssertions(classUnderTest.theNewMap(), "testTheNewMap");
  // }

  private void performMapAssertions(Map<Integer, String> theMap, String testName) {
    assertNotNull(theMap);
    assertEquals(5, theMap.size());
    assertTrue(theMap.get(1).equals("Lorem"));
    assertTrue(theMap.get(2).equals("ipsum"));
    assertTrue(theMap.get(3).equals("dolor"));
    assertTrue(theMap.get(4).equals("sit"));
    assertTrue(theMap.get(5).equals("amet"));
    log.info(testName + ":" + Arrays.toString(theMap.entrySet().toArray()));
  }

}
