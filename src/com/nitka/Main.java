package com.nitka;

import com.nitka.tests.FirstTest;
import com.nitka.tests.SecondTest;
import com.nitka.tests.ThirdTest;
import org.junit.runner.JUnitCore;

public class Main {
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        StringBuilder finalResult = new StringBuilder("Counts of test`s fails: ");
        finalResult.append(junit.run(FirstTest.class, SecondTest.class, ThirdTest.class).getFailureCount());
        System.out.print(finalResult);
    }
}
