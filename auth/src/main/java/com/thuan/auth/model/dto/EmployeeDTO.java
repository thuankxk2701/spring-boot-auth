package com.thuan.auth.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
        private int employeeId;
        private String employeeName;
        private String email;
        private String password;
}
