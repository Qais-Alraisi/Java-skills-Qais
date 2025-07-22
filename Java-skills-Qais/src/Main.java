public class Main {
    /*public static void main(String[] args) {

        UserInfo user1 = new UserInfo("Qais",19,"qais.h.alraisi@gmail.com",true);
        UserInfo user2 = new UserInfo("Qassim",18,"qassim@gmail.com",false);
        UserInfo user3 = new UserInfo("Qabas",21,"qabas@gmail.com",true);

        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();

        user1.set_name("Qais-test");
        user2.set_age(39);
        user3.set_email("test@gmail.com");
        user1.set_isActive(false);

        System.out.println(user1.getName());
        System.out.println(user2.getAge());
        System.out.println(user3.getEmail());
        System.out.println(user1.isActive());


             }*/

    public static void main(String[] args) {
    PayrollCalculator employee1 = new PayrollCalculator("FULL_TIME",50,40);
    System.out.println(employee1.calculateWeeklyPay());

    }
}
