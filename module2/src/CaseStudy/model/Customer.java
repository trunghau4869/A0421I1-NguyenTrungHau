package CaseStudy.model;

public class Customer extends Person{
    private String typeCustomer;

    public Customer() {
    }

    public Customer(int id, String name, int age, String address, String sex, String idCard, String email, String typeCustomer) {
        super(id, name, age, address, sex, idCard, email);
        this.typeCustomer = typeCustomer;
    }

    public Customer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer : " +super.toString()+
                "typeCustomer='" + typeCustomer + '\'' ;
    }
}
