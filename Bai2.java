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
    private String name;

    public OfficeEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sendEmail(String to, String content) {
        System.out.println(name + " gửi email đến " + to + ": " + content);
    }
}

class TechnicalEmployee implements Programmer, EmailSender {
    private String name;

    public TechnicalEmployee(String name) {
        this.name = name;
    }

    @Override
    public void code(String language) {
        System.out.println(name + " lập trình bằng " + language);
    }

    @Override
    public void sendEmail(String to, String content) {
        System.out.println(name + " gửi email đến " + to + ": " + content);
    }
}

class SalesEmployee implements Salesperson, EmailSender {
    private String name;

    public SalesEmployee(String name) {
        this.name = name;
    }

    @Override
    public void sell(String product, int quantity) {
        System.out.println(name + " bán " + quantity + " " + product);
    }

    @Override
    public void sendEmail(String to, String content) {
        System.out.println(name + " gửi email đến " + to + ": " + content);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        OfficeEmployee office = new OfficeEmployee("Nguyễn Văn Đà");
        TechnicalEmployee tech = new TechnicalEmployee("Trần Diệu Linh");
        SalesEmployee sales = new SalesEmployee("Phạm Việt Hùng");

        office.sendEmail("boss@company.com", "Báo cáo văn phòng");

        tech.code("Java");
        tech.sendEmail("boss@company.com", "Báo cáo kỹ thuật");

        sales.sell("Laptop", 5);
        sales.sendEmail("boss@company.com", "Báo cáo doanh số");
    }
}
