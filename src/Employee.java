public class Employee {
    public String name;
    public String email;
    public double hourRate;
    public double capacity;
    public int freeDays;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setFreeDays(int freeDays) {
        this.freeDays = freeDays;
    }

    public double calculateDailyIncome() {
        return hourRate * capacity;
    }

    public double calculateMonthlyIncome() {
        return (30 - freeDays) * calculateDailyIncome();
    }
}
