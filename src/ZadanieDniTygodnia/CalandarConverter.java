package ZadanieDniTygodnia;

import java.time.MonthDay;

 class CalandarConverter {
    private static final String MONDAY = " 1 dzień tygodnia to Poniedzialek";
    private static final String TUESDAY = " 2 dzień tygodnia to Wtorek";
    private static final String WEDNESDAY = " 3 dzień tygodnia to Sroda";
    private static final String THYRSDAY = " 4 dzień tygodnia to Czwartek";
    private static final String FRIDAY = " 5 dzień tygodnia to Piotek";
    private static final String SATURDAY = " 6 dzień tygodnia to Sobota";
    private static final String SUNDAY = " 7 dzień tygodnia to Niedziela";
    private static final String dayOff = " 8 dzień tygodnia to Nie ma takiego dnia";


   static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THYRSDAY;
            case 5:
               return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
                default:
                    return dayOff;
        }
    }
}