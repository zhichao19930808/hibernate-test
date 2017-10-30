package xin.zcglory.entity;

import java.sql.Date;

public class Student {
    private int id;
    private String name;
    private String address;
    private Date time;

    public Student(String name, String address, Date time) {
        this.name = name;
        this.address = address;
        this.time = time;
    }

    public Student(int id, String name, String address, Date time) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.time = time;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", time=" + time +
                '}';
    }
}
