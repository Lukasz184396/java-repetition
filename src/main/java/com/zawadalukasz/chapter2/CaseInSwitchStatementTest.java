package com.zawadalukasz.chapter2;

public class CaseInSwitchStatementTest {
    private int getSortOrder(String firstName, final String lastName) {
                                               /* lastName
                                               is not constant as it is passed to the function*/
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;

        switch (firstName) {
            case "Test":
                return 52;
//            case middleName: // DOES NOT COMPILE it is not final
//                id = 5;
//                break;
            case suffix:
                id = 0;
                break;
//            case lastName: // DOES NOT COMPILE
//                id = 8;
//                break;

//            case 5:       // DOES NOT COMPILE -> 5 is not String
//                id = 7;
//                break;

//            case 'J': // DOES NOT COMPILE 'J' is not String
//                id = 10;
//                break;

//            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE is not String
//                id=15;
//                break;


        }
        return id;

    }

    public static void main(String[] args) {

    }
}
