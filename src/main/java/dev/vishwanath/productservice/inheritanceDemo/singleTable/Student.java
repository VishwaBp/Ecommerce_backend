package dev.vishwanath.productservice.inheritanceDemo.singleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_student")
public class Student extends user {
    private double psp;
    private double atendance;
}
