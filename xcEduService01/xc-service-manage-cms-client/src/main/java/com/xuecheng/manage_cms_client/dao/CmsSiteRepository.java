package com.xuecheng.manage_cms_client.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by fanfan on 2019/11/30.
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite, String> {
}
