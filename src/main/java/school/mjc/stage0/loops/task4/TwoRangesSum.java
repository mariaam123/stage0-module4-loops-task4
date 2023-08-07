package school.mjc.stage0.loops.task4;
public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bigger then the last");
                return;
            }
            if (lastInRow < 0) {
                System.out.println("last number in row is negative");
                return;
            }
            if (numberToSkip == lastInRow) {
                System.out.println("skipped sum is 55");
                System.out.println("counted sum is 0");
                return;
            }

        int skippedSum = 0;
        int countedSum = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (i % numberToSkip == 0) {
                skippedSum+=i;
                continue;
            }
            countedSum += i;
        }
        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }

    public static void main(String[] args) {
        TwoRangesSum twoRangesSum = new TwoRangesSum();
        int numberToSkip = 1;
        int lastInRow = -6;
        twoRangesSum.printSumOfTwoRanges(numberToSkip, lastInRow);
    }
}
