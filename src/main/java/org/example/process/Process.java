package org.example.process;

import org.example.model.Vertical;

public class Process {
   public static double calculateDistance(Vertical start, Vertical end) {
       return Math.sqrt(Math.pow(end.getX()-start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }
}
