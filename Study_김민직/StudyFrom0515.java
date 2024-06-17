package Study_김민직;

public class StudyFrom0515 {
    public static void main(String[] args) {
//        String[][] menu = {
//                {"아메리카노", "카페라떼", "카푸치노", "에스프레소", "카페모카"},
//                {"고구마라떼", "쿠키초코라떼", "그린티라떼", "딸기라떼", "망고라떼"},
//                {"자몽에이드", "레몬에이드", "망고에이드", "유자에이드", "청포도에이드"}
//        };
//        int category = 2;
//
//        switch (category) {
//            case 0:
//                for (int detail = 0; detail < 5; detail++) {
//                    System.out.println(menu[category][detail]);
//                }
//                break;
//            case 1:
//                for (int detail = 0; detail < 5; detail++) {
//                    System.out.println(menu[category][detail]);
//                }
//                break;
//            case 2:
//                for (int detail = 0; detail < 5; detail++) {
//                    System.out.println(menu[category][detail]);
//                }
//                break;
        detail Detail = new detail();
        Detail.showDetailMenu(2); // 0 : 커피, 1 : 논커피 라떼, 2 : 에이드
    }
}

