package com.utn.Spring.model;

import com.utn.Spring.model.inter.IGetSalaryforStudent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public
class Student extends Person {

    private IGetSalaryforStudent iGetSalaryforStudent;
}
