package Study_김민직;

public class Parking {
    int numOfCar = 3; // 나중에 일반화하기
    static String[][] records = {
            {"05:34", "5961", "IN"},
            {"06:00", "0000", "IN"},
            {"06:34", "0000", "OUT"},
            {"07:59", "5961", "OUT"},
            {"07:59", "0148", "IN"},
            {"18:59", "0000", "IN"},
            {"19:09", "0148", "OUT"},
            {"22:59", "5961", "IN"},
            {"23:00", "5961", "OUT"}
    };

    public int[] solution(int[] fees, String[] records) {
        fees = new int[4];
        fees[0] = 180; // 기본 시간(분)
        fees[1] = 5000; // 기본 요금(원)
        fees[2] = 10; // 단위 시간(분)
        fees[3] = 600; // 단위 요금(원)

//        for (int i = 1; i < records.length; i++) {
//            if (records[0][1].records[i][1]) {
//
//                }
//        }

        int[] answer = new int[numOfCar]; // result 배열
        // 오름차순으로 같은 차량 번호를 찾아서 해당 원소 인덱스를 이용, 누적 주차 요금 계산

        return answer;
    }
}