public class PayrollCalculator {
    private String _employeeType;
    private double _hoursWorked;
    private double _hourlyRate;


    public PayrollCalculator(String employeeType, double hoursWorked, double hourlyRate) {
        if (employeeType.equals("FULL_TIME") || employeeType.equals("PART_TIME") || employeeType.equals("CONTRACTOR") || employeeType.equals("INTERN")) {
            _employeeType = employeeType;
        } else {
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
                } else {
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

    double weeklyPay;

    public double calculateWeeklyPay() {
        switch (_employeeType) {
            case "FULL_TIME":
                if (_hoursWorked > 40) {
                    double overtime = _hoursWorked - 40;
                    weeklyPay = (40 * _hourlyRate + overtime * _hourlyRate * 1.5);
                }
                break;
            case "PART_TIME":
                weeklyPay = (_hoursWorked * _hourlyRate);
                break;
            case "CONTRACTOR":
                weeklyPay = (_hoursWorked * _hourlyRate);
                break;
            case "INTERN":
                weeklyPay = (_hoursWorked * _hourlyRate * 0.8);
                break;
        }
        return weeklyPay;
    }

    public double calculateTaxDeduction(double grossPay, boolean hasHealthInsurance) {
        double tax = 0;
        if (grossPay < 0) {
            System.out.println("Invalid gross pay");
        } else if (0 < grossPay && grossPay < 500) {
            tax = grossPay * 0.1;
            if (hasHealthInsurance) {
                tax = tax - 50;
            }
        } else if (500 < grossPay && grossPay < 1000) {
            tax = grossPay * 0.15;
            if (hasHealthInsurance) {
                tax = tax - 50;
            }
        } else if (1000 < grossPay && grossPay < 2000) {
            tax = grossPay * 0.2;
            if (hasHealthInsurance) {
                tax = tax - 50;
            }
        } else {
            tax = grossPay * 0.25;
            if (hasHealthInsurance) {
                tax = tax - 50;
            }
        }
        return tax;
    }

    public static void processPayroll(String[] employeeTypes, double[] Hours, double[] Rates, String[] Names){
        PayrollCalculator[] payrolls = new PayrollCalculator[employeeTypes.length];
        for (int i =0; i < employeeTypes.length; i++){
            payrolls[i] = new PayrollCalculator(employeeTypes[i],Hours[i],Rates[i]);
            System.out.println("Employee: " + Names[i]);
            System.out.println("Type: " + employeeTypes[i]);
            System.out.println("Hours Worked: " + Hours[i]);
            System.out.println("Rate: " + Rates[i]);
            System.out.println("Pay: " + payrolls[i].calculateWeeklyPay());
            System.out.println("__________________________");
        }
    }
}




