package com.liyashe.dao;

import com.liyashe.domain.Account;
import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(Account record);

    Account selectByPrimaryKey(Long userId);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);
}