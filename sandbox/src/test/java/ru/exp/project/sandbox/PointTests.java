package ru.exp.project.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test

     public void testDistance() {
      Point p1 = new Point(4, 8);
      Point p2 = new Point(1, 2);
    Assert.assertEquals(p1.distance(p2), 6.708203932499369);
    }
  }
