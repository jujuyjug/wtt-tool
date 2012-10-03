/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitblend.wtt.persistence;

import com.bitblend.wtt.domain.ServiceItem;
import java.util.Date;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.joda.time.LocalDate;
import org.springframework.data.jpa.domain.Specification;

/**
 *
 * @author zklibur
 */
public class ServiceItemSpecifications {

    public static Specification<ServiceItem> customSpecification(final LocalDate date) {

        return null;
// Example:
//        return new Specification<Customer>() {
//            @Override
//            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//
//                Root<Account> accounts = query.from(Account.class);
//                Path<Date> expiryDate = accounts.<Date>get("expiryDate");
//                Predicate customerIsAccountOwner = cb.equal(accounts.<Customer>get("customer"), root);
//                Predicate accountExpiryDateBefore = cb.lessThan(expiryDate, date.toDateMidnight().toDate());
//
//                return cb.and(customerIsAccountOwner, accountExpiryDateBefore);
//            }
//        };
    }
}
