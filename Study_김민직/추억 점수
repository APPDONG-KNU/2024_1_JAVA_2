import java.util.ArrayList;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        int answerScore = 0;
        for (int i = 0; i < name.length; i++) {
            nameList.add(name[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                list.add(photo[i][j]);
            }
            for (String s : nameList) {
                for (int j = 0; j < photo[i].length; j++) {
                    if (list.get(j).equals(s)) {
                        answerScore += yearning[nameList.indexOf(s)];
                    }
                }
            }
            answer[i] = answerScore;
            answerScore = 0;
            list.clear();
        }
        
        return answer;
    }
}
