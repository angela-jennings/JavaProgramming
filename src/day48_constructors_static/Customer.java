package day48_constructors_static;

public class Customer {
    private String name;
    private int id;

    public Customer(){
        System.out.println("New Customer Information:");
    }
    public Customer(String name, int id){
        setName(name);
        setId(id);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("invalid name");
        }else{
            this.name = name;
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
