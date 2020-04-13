package com.utn.Spring.model;

import com.utn.Spring.model.inter.IGetSalaryforEmployer;

public
class GetSalaryforEmployerImp implements IGetSalaryforEmployer {
    @Override
    public
    Integer getSalary ( ) {

        return new Integer(50);
        }
    }


