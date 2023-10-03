public class Feedback {
    int id;
    String Description;
    Customer customer;

    public Feedback(int id, String description, Customer customer) {
        this.id = id;
        Description = description;
        this.customer = customer;

    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", Description='" + Description + '\'' +
                ", customer=" + customer +
                '}';
    }
}
