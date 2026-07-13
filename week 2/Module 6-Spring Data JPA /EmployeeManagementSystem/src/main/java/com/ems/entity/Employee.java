package com.cts.ems.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String employeeName;

    private String email;

    private double salary;
@CreatedDate
@Column(updatable = false)
private LocalDateTime createdDate;

@LastModifiedDate
private LocalDateTime lastModifiedDate;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}