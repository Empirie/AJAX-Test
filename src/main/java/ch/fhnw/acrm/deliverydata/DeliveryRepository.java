package ch.fhnw.acrm.deliverydata;

import ch.fhnw.acrm.business.service.AgentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryData, Long> {
//    DeliveryData findOne(Long id);
//    DeliveryData save(DeliveryData entity);
//    DeliveryRepository findByAgent_Id(Long a)




}
