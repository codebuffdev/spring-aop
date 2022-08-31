package in.spdev.aop.timetracker.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Account {
     private int accountNo;
     private String accountHolderName;
     private String accountType;
     private String mobileNo;
     private String emailAddress;
     private int balance;

}
