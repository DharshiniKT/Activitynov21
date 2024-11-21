package Activityjpaapp;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="SalesTable")
public class Sales {
    @Id
    private int saleId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SalePerson> salesPersonList; 

    private float totalSales;

    public Sales() {
        super();
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public List<SalePerson> getSalesPersonList() {
        return salesPersonList;
    }

    public void setSalesPersonList(List<SalePerson> salesPersonList) {
        this.salesPersonList = salesPersonList;
    }

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
    }
}