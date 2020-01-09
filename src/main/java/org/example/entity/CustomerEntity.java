package org.example.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@Entity(name = "CustomerEntity")
@Table (name = "Customer")
public class CustomerEntity {
@Id
@GeneratedValue
    @Column(name="id")
    private Long id;
    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;

//   private Set <AddressEntity> addresses = new HashSet<AddressEntity>();

}
