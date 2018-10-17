package com.fangshuo.lib4fangshuo.mongo.model.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 
* Copyright: Copyright (c) 2018 Jun_Zhou
* 
* @ClassName: SecondaryRepository.java
* @Description: SecondaryRepository
* 
* @version: v1.0.0
* @author: JunZhou
* @Email: 1769676159@qq.com
* @Site: CERNO
* @date: 2018年10月17日 下午9:11:01
 */
public interface SecondaryRepository extends MongoRepository<SecondaryMongoObject, String> {
}
