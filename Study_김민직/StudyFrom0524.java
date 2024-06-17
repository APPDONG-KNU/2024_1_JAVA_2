package Study_김민직;

import java.util.ArrayList;
import java.util.HashMap;

public class StudyFrom0524 {
    public static void main(String[] args) {
        int restOfSemester = 33;
        HashMap<String, Integer> ticket = new HashMap<>();
        ticket.put("A", 53);
        ticket.put("B", 64);
        ticket.put("C", 45);
        ticket.put("D", 59);
        ticket.put("E", 72);
        ticket.put("F", 45);

        ArrayList<Integer> requiredList = new ArrayList<>();
        HashMap<String, Integer> leftoverTicket= new HashMap<>();
        requiredList.add(ticket.get("A") / restOfSemester);
        for (String s : ticket.keySet()) {
            requiredList.add(ticket.get(s) / restOfSemester);
            int useTicket = ticket.get(s) / restOfSemester;
            if (ticket.get(s) / restOfSemester > 3) {
                leftoverTicket.put(s, (3 - useTicket) * 33);
            }
        }

        for (Integer i : requiredList) {
            System.out.println(i);
        }
    }
}
