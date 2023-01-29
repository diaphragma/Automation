public class Month {
    public static void selectMonth(int numberOfMonth) {
        String nameOfMonth = null;
        int numberOfDays = 0;
        switch (numberOfMonth) {
            case 1:
                nameOfMonth = "January";
                numberOfDays = 31;
                break;
            case 2:
                nameOfMonth = "February";
                numberOfDays = 28;
                break;
            case 3:
                nameOfMonth = "March";
                numberOfDays = 31;
                break;
            case 4:
                nameOfMonth = "April";
                numberOfDays = 30;
                break;
            case 5:
                nameOfMonth = "May";
                numberOfDays = 31;
                break;
            case 6:
                nameOfMonth = "June";
                numberOfDays = 30;
                break;
            case 7:
                nameOfMonth = "July";
                numberOfDays = 31;
                break;
            case 8:
                nameOfMonth = "August";
                numberOfDays = 31;
                break;
            case 9:
                nameOfMonth = "September";
                numberOfDays = 30;
                break;
            case 10:
                nameOfMonth = "October";
                numberOfDays = 31;
                break;
            case 11:
                nameOfMonth = "November";
                numberOfDays = 30;
                break;
            case 12:
                nameOfMonth = "December";
                numberOfDays = 31;
                break;
            default:
                System.out.println("Incorrect data. Check that you have entered a NUMBER between 1-12.");
        }
        System.out.println("You have selected a month: " + nameOfMonth + " \nwith amount of days: " + numberOfDays + "\n");
    }

}
