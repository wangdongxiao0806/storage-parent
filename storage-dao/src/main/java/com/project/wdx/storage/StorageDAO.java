package com.project.wdx.storage;

import com.project.wdx.storage.model.StorageDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StorageDAO extends JpaRepository<StorageDO,Long> {
}
