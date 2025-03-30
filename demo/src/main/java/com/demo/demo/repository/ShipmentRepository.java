package com.demo.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.demo.entity.Shipment;


@Repository
public interface ShipmentRepository extends JpaRepository<Shipment,Long>{
    public List<Shipment> findBycost(double cost);

    
    @Query("SELECT s FROM Shipment s WHERE s.status = :status")
    List<Shipment>findBystatus(String status);

    @Query("SELECT s FROM Shipment s JOIN FETCH s.deliveries WHERE s.id = :shipmentId")
    Shipment findShipmentWithDeliveries(@Param("shipmentId") Long shipmentId);
}
