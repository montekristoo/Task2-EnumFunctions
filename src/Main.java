import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GradingSystem gradingSystem = GradingSystem.BASIC;
        manualTest(gradingSystem);
//        automaticTest(gradingSystem);
    }

    private static void manualTest(GradingSystem gradingSystem) {
        System.out.println("Manual testing: ");
        System.out.println();
        System.out.println("->>>>> CURRENT: " + gradingSystem);
        gradingSystem = gradingSystem.next();
        System.out.println("->>>>> NEXT: " + gradingSystem);
        gradingSystem = gradingSystem.next();
        System.out.println("->>>>> NEXT: " + gradingSystem);
        gradingSystem = gradingSystem.next();
        System.out.println("->>>>> NEXT: " + gradingSystem);
        gradingSystem = gradingSystem.previous();
        System.out.println("->>>>> PREVIOUS: " + gradingSystem);
        gradingSystem = gradingSystem.previous();
        System.out.println("->>>>> PREVIOUS: " + gradingSystem);
        gradingSystem = gradingSystem.previous();
        System.out.println("->>>>> PREVIOUS: " + gradingSystem);
        System.out.println("->>>>> ALL ELEMENTS: ");
        gradingSystem.showAll();
    }

    private static void automaticTest(GradingSystem gradingSystem) {
        System.out.println();
        System.out.println("'While' tests");
        System.out.println();
        //NEXT
        System.out.println("->>>>> CURRENT: " + gradingSystem);
        while (gradingSystem.hasNext()) {
            gradingSystem = gradingSystem.next();
            System.out.println("->>>>> NEXT: " + gradingSystem);
        }

        System.out.println();
        System.out.println("->>>>> CURRENT: " + gradingSystem);
        //PREVIOUS
        while (gradingSystem.hasPrevious()) {
            gradingSystem = gradingSystem.previous();
            System.out.println("->>>>> PREVIOUS: " + gradingSystem);
        }
    }
}
