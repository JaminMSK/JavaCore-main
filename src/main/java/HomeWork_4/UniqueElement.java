package HomeWork_4;

/* Сделал Vladislav Torgashev
04.04.2022
 */

public class UniqueElement {
    private String uniqueNname;
    private Integer counterRepeat;

    public UniqueElement(String name, int count){
        this.uniqueNname = name;
        this.counterRepeat = (Integer)count;
    }

    public Integer getCount() {
        return counterRepeat;
    }

    public void setCount(Integer count) {
        this.counterRepeat = count;
    }



    @Override
    public String toString() {
        return "UniqueElement {" +
                "uniqueNname='" + uniqueNname + '\'' +
                ", counterRepeat=" + counterRepeat +
                '}';
    }
}

