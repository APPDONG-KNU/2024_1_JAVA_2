package Study_김민직;

public class CodingTest {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer3 = (numer1 * denom2) + (numer2 * denom1);
        int denom3 = denom1 * denom2;
        int i = 2;
        int i1 = 1;
        while ((i <= numer3) && (i <= denom3)) {
            if (numer3 < 2) {
                i1 = 1;
            }

            if ((numer3 % i == 0) && (denom3 % i == 0)) {
                i1 = i;
            }
            i++;
        }
        answer[0] = numer3 / i1;
        answer[1] = denom3 / i1;

        return answer;
    }
}
