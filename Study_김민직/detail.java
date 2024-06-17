package Study_김민직;

public class detail {
    String[][] menu = {
            {"아메리카노", "카페라떼", "카푸치노", "에스프레소", "카페모카"},
            {"고구마라떼", "쿠키초코라떼", "그린티라떼", "딸기라떼", "망고라떼"},
            {"자몽에이드", "레몬에이드", "망고에이드", "유자에이드", "청포도에이드"}
    };

    public void showDetailMenu(int category) {
        for (int detail = 0; detail < 5; detail++) {
            System.out.println(menu[category][detail]);
        }
    }

}
