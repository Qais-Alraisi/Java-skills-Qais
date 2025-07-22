public class PayrollCalculator {
    private String _employeeType;
    private double _hoursWorked;
    private double _hourlyRate;



    public PayrollCalculator(String employeeType, double hoursWorked, double hourlyRate) {
        if (employeeType.equals("FULL_TIME") || employeeType.equals("PART_TIME") || employeeType.equals("CONTRACTOR") || employeeType.equals("INTERN")) {
            _employeeType = employeeType;
        }
        else{
            System.out.println("Invalid employee type");
        }
        switch (employeeType) {
            case "FULL_TIME":
                if (hoursWorked >= 0 && hourlyRate >= 0) {
                    _hoursWorked = hoursWorked;
                    _hourlyRate = hourlyRate;
                } else {
                    System.out.println("Invalid value for hours worked or hourly rate");
                }
                break;
            case "PART_TIME":
                if (hoursWorked >= 0 && hourlyRate >= 0) {
                    _hourlyRate = hourlyRate;
                    if (hoursWorked > 25) {
                        System.out.println("Hours worked by part time employees cannot be more than 25");
                    } else {
                        _hoursWorked = hoursWorked;
                    }
                } else{
                    System.out.println("Invalid value for hours worked or hourly rate");
                }
                break;
            case "CONTRACTOR":
                if (hoursWorked >= 0 && hourlyRate >= 0) {
                    _hoursWorked = hoursWorked;
                    _hourlyRate = hourlyRate;
                } else {
                    System.out.println("Invalid value for hours worked or hourly rate");
                }
                break;
            case "INTERN":
                if (hoursWorked >= 0 && hourlyRate >= 0) {
                    _hourlyRate = hourlyRate;
                if (hoursWorked > 20) {
                    System.out.println("Hours worked by interns cannot be more than 20");
                } else {
                    _hoursWorked = hoursWorked;
                    break;
                }
        } else {
            System.out.println("Invalid value for hours worked or hourly rate");
        }
        }
}

    void set_employeeType(String employeeType) {
        if (employeeType.equals("FULL_TIME") || employeeType.equals("PART_TIME") || employeeType.equals("CONTRACTOR") || employeeType.equals("INTERN")) {
        _employeeType = employeeType;
        }
        else{
            System.out.println("Invalid employee type");
        }
    }

    void set_hoursWorked(double hoursWorked) {
        _hoursWorked = hoursWorked;
    }

    void set_hourlyRate(double hourlyRate) {
        _hourlyRate = hourlyRate;
    }

    String get_employeeType() {
        return _employeeType;
    }

    double get_hoursWorked() {
        return _hoursWorked;
    }

    double get_hourlyRate() {
        return _hourlyRate;
    }

    public enum employeeType {
        FULL_TIME, PART_TIME, CONTRACTOR, INTERN
    }

    double weeklyPay;
    public double calculateWeeklyPay() {
        switch (_employeeType) {
            case "FULL_TIME":
                if (_hoursWorked > 40) {
                    double overtime = _hoursWorked-40;
                     weeklyPay = (40*_hourlyRate + overtime*_hourlyRate*1.5);
                }
                break;
            case "PART_TIME":
                weeklyPay =  (_hoursWorked*_hourlyRate);
                break;
            case "CONTRACTOR":
                weeklyPay = (_hoursWorked*_hourlyRate);
                break;
            case "INTERN":
                weeklyPay =  (_hoursWorked*_hourlyRate*0.8);
                break;
        }
        return weeklyPay;
    }

    public double calculateTaxDeduction(double grossPay,boolean hasHealthInsurance){
        }
    }
}
