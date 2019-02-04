package ZadanieDniTygodnia;

import java.time.MonthDay;

 class CalandarConverter {
    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THYRSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;



   static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case MONDAY:
                return "Poniedziałek";
            case TUESDAY:
                return "Wtorek";
            case WEDNESDAY:
                return "Sroda";
            case THYRSDAY:
                return "Czwartek";
            case FRIDAY:
               return "Piątek";
            case SATURDAY:
                return "Sobota";
            case SUNDAY:
                return "Niedziela";
            default:
                    return "Nie ma takiego dnia";
        }
    }
}