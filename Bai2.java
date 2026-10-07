interface EmailSender {
    void sendEmail(String to, String content);
}

interface Programmer {
    void code(String language);
}

interface Salesperson {
    void sell(String product, int quantity);
}

class OfficeEmployee implements EmailSender {
    @Override
    public void sendEmail(String to, String content) {
        System.out.println("OfficeEmployee gửi email đến " + to + ": " + content);
    }
}

class TechnicalEmployee implements Programmer, EmailSender {
    @Override
    public void code(String language) {
        System.out.println("TechnicalEmployee lập trình bằng " + language);
    }

    @Override
    public void sendEmail(String to, String content) {
        System.out.println("TechnicalEmployee gửi email đến " + to + ": " + content);
    }
}

class SalesEmployee implements Salesperson, EmailSender {
    @Override
    public void sell(String product, int quantity) {
        System.out.println("SalesEmployee bán " + quantity + " " + product);
    }

    @Override
    public void sendEmail(String to, String content) {
        System.out.println("SalesEmployee gửi email đến " + to + ": " + content);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        OfficeEmployee office = new OfficeEmployee();
        TechnicalEmployee tech = new TechnicalEmployee();
        SalesEmployee sales = new SalesEmployee();

        office.sendEmail("boss@company.com", "Báo cáo văn phòng");

        tech.code("Java");
        tech.sendEmail("boss@company.com", "Báo cáo kỹ thuật");

        sales.sell("Laptop", 5);
        sales.sendEmail("boss@company.com", "Báo cáo doanh số");
    }
}
