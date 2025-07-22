    public class UserInfo {

        private String _name;
        private int _age;
        private String _email;
        private boolean _isActive;

        public UserInfo(String name, int age, String email, boolean isActive) {
            _name = name;
            _age = age;
            _email = email;
            _isActive = isActive;
        }

        String getName() {
            return _name;
        }

        int getAge() {
            return _age;
        }
        String getEmail() {
            return _email;
        }


        boolean isActive() {
            return _isActive;
        }

        public void set_name(String name) {
            _name = name;
        }

        public void set_age(int age) {
            _age = age;
        }

        public void set_email(String email) {
            _email = email;
        }

        public void set_isActive(boolean isActive) {
            _isActive = isActive;
        }

        public void displayInfo(){
            System.out.println("Name: "+getName());
            System.out.println("Age: "+getAge());
            System.out.println("Email: "+getEmail());
            System.out.println("isActive: "+isActive());
        }
    }
