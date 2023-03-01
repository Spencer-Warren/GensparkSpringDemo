package org.assignment2;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    private int id;
    private String name;
    private List<Phone> phones;
    private Address address;

    public Student(int id, String name, List<Phone> phones, Address address) {
        this.id = id;
        this.name = name;
        this.phones = phones;
        this.address = address;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", phones=" + phones + ", address=" + address + "]";
    }
}
