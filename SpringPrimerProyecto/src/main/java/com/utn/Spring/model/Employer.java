package com.utn.Spring.model;

import com.utn.Spring.model.inter.IGetSalaryforEmployer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public
class Employer extends Person {

    private IGetSalaryforEmployer iGetSalaryforEmployer;
}
