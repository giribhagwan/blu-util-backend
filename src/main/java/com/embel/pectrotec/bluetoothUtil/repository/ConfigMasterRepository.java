package com.embel.pectrotec.bluetoothUtil.repository;

import com.embel.pectrotec.bluetoothUtil.domain.ConfigMaster;
import com.embel.pectrotec.bluetoothUtil.dto.ConfigCountResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfigMasterRepository extends JpaRepository<ConfigMaster,Long> {
   List<ConfigCountResponse> findByConfigName(String configName);
}
