package com.project.wdx.storage;

import com.alibaba.dubbo.config.annotation.Service;
import com.project.wdx.facade.StorageService;
import com.project.wdx.storage.model.StorageDO;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDAO storageDAO;

    public void deduct(String commodityCode, int count) {
        StorageDO storageDO = new StorageDO();
        storageDO.setCommodityCode(commodityCode);
        storageDO.setCount(count);
        storageDAO.saveAndFlush(storageDO);
    }
}
