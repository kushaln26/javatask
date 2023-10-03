public class FeedbackMain {

    Feedback[] store = new Feedback[4];

    int index;
    void addFeedback(Feedback feedback){
        store[index] = feedback;
        index++;
    }

    Customer[] arr = new Customer[4];

    int index1;
    void addCustomer(Customer customer) {
        arr[index1] = customer;
        index1++;
    }
    void feedbackDisplay(){
        for(int i=0; i<store.length; i++){
            System.out.println(store[i]);
        }
    }

    void customerDisplay(){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    Feedback[] fetchId(int id){
        Feedback[] feedbackArray = new Feedback[2];
        int feedbackIndex = 0;
        for(int i=0; i< store.length; i++){
            if(store[i].customer.id == id){
                feedbackArray[feedbackIndex] = store[i];
                feedbackIndex++;


            }
        }
        return feedbackArray;
    }

    public static void main(String[] args) {

        FeedbackMain demo = new FeedbackMain();
        Customer customer1 =new Customer(1,"rob");
        demo.addCustomer(customer1);
        Customer customer2 =new Customer(2,"bob");
        demo.addCustomer(customer2);
        Customer customer3 =new Customer(3,"tom");
        demo.addCustomer(customer3);
        Customer customer4 =new Customer(4,"ram");
        demo.addCustomer(customer4);

        //  demo.customerDisplay();

        Feedback feedback1 = new Feedback(101,"good", customer1);
        demo.addFeedback(feedback1);
        Feedback feedback2 = new Feedback(102,"average", customer2);
        demo.addFeedback(feedback2);
        Feedback feedback3 = new Feedback(103,"better", customer1);
        demo.addFeedback(feedback3);
        Feedback feedback4 = new Feedback(104,"best", customer4);
        demo.addFeedback(feedback4);

        // demo.feedbackDisplay();
        Feedback[] f1;
        f1=demo.fetchId(1);
        for(int i=0; i<f1.length; i++){
            System.out.println(f1[i]);
        }









    }
}
