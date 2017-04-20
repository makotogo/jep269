package com.makotojava.learn.episode2;

// Uncomment for JDK 9 Stuff
import static java.util.Map.entry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {

  public String[] soEasy() {
    return new String[] {
        "Lorem", "ipsum", "dolor", "sit", "amet"
    };
  }

  public List<String> theOldList() {
    List<String> ret = new ArrayList<>();

    ret.add("Lorem");
    ret.add("ipsum");
    ret.add("dolor");
    ret.add("sit");
    ret.add("amet");

    ret = Collections.unmodifiableList(ret);
    return ret;
  }

  public Set<String> theOldSet() {
    Set<String> ret = new HashSet<>();

    ret.add("Lorem");
    ret.add("ipsum");
    ret.add("dolor");
    ret.add("sit");
    ret.add("amet");

    ret = Collections.unmodifiableSet(ret);
    return ret;
  }

  public Map<Integer, String> theOldMap() {
    Map<Integer, String> ret = new HashMap<>();

    ret.put(1, "Lorem");
    ret.put(2, "ipsum");
    ret.put(3, "dolor");
    ret.put(4, "sit");
    ret.put(5, "amet");

    ret = Collections.unmodifiableMap(ret);
    return ret;
  }

  // Uncomment for JDK 9 Stuff
  public List<String> theNewList() {
    return List.of("Lorem", "ipsum", "dolor", "sit", "amet");
  }

  // Uncomment for JDK 9 Stuff
  public Set<String> theNewSet() {
    return Set.of("Lorem", "ipsum", "dolor", "sit", "amet");
  }

  // Uncomment for JDK 9 Stuff
  public Map<Integer, String> theNewMap() {
    return Map.ofEntries(
        entry(1, "Lorem"), entry(2, "ipsum"), entry(3, "dolor"), entry(4, "sit"), entry(5, "amet"));
  }

}
