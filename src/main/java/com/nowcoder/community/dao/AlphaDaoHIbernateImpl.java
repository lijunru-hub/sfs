package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaoHIbernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "hibernata";
    }
}
