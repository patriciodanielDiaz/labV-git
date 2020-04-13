package com.utn.Spring.model;

import com.utn.Spring.model.inter.IGetSalaryforStudent;

public
class GetSalaryforStudentImp implements IGetSalaryforStudent {
    @Override
    public
    Integer getSalary ( ) {
        return new Integer(10);
    }
}
