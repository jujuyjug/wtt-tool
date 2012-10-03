package com.bitblend.wtt.persistence;

import com.bitblend.wtt.domain.ServiceItem;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository interface for {@link ServiceItem} instances. Provides basic CRUD
 * operations due to the extension of {@link JpaRepository}. Includes custom
 * implemented functionality by extending {@link ServiceItemRepositoryCustom}.
 *
 * @author zklibur
 */
public interface ServiceItemRepository
        extends CrudRepository<ServiceItem, String>,
        JpaSpecificationExecutor<ServiceItem>,
        QueryDslPredicateExecutor<ServiceItem>,
        ServiceItemRepositoryCustom {
}
