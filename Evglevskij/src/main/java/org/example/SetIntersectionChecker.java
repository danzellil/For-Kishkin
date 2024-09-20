package org.example;

import java.util.HashSet;
import java.util.Set;


public class SetIntersectionChecker {
    public boolean isIntersecting(Set<Integer> set1, Set<Integer> set2) {
        if (set1.isEmpty() || set2.isEmpty()) {
            return false;
        }
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return !intersection.isEmpty();


    }

}
