package com.springbootdemo.common.service;

import com.springbootdemo.common.domain.LogDO;
import com.springbootdemo.common.domain.PageDO;
import com.springbootdemo.common.utils.Query;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
