package Activityjpaapp;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="SalesPersonTable")
public class SalePerson {
    @Id
    private int personId;
    
    private String personName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Order> orderList; 

    public SalePerson() {
        super();
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}