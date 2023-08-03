package com.embel.pectrotec.bluetoothUtil.repository;

import com.embel.pectrotec.bluetoothUtil.domain.DeviceStream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface DeviceStreamRepository extends JpaRepository<DeviceStream,Long> {

    List<DeviceStream> findByProcessNumber(String orderNumber);

    List<DeviceStream> findByProcessNumberAndCreatedTimestampBetween(String processNumber, Timestamp fromDate, Timestamp toDate);
}
