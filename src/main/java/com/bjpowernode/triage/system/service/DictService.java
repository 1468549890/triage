package com.bjpowernode.triage.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bjpowernode.triage.common.persistence.HibernateDao;
import com.bjpowernode.triage.common.service.BaseService;
import com.bjpowernode.triage.system.dao.DictDao;
import com.bjpowernode.triage.system.entity.Dict;

/**
 * 字典service
 * @author ty
 * @date 2016年1月13日
 */
@Service
@Transactional(readOnly=true)
public class DictService extends BaseService<Dict, Integer> {
	
	@Autowired
	private DictDao dictDao;

	@Override
	public HibernateDao<Dict, Integer> getEntityDao() {
		return dictDao;
	}
}
