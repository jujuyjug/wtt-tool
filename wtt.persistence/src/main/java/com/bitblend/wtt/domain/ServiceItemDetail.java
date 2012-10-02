package com.bitblend.wtt.domain;

import java.io.Serializable;

/**
 *
 * @author zklibur
 */
public class ServiceItemDetail extends WorkItem implements Serializable {

    private ServiceItem service;

    public ServiceItemDetail() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.service != null ? this.service.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ServiceItemDetail other = (ServiceItemDetail) obj;
        if (this.service != other.service && (this.service == null || !this.service.equals(other.service))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ServiceItemDetail{" + "service=" + service + '}' + super.toString();
    }

    public ServiceItem getService() {
        return service;
    }

    public void setService(ServiceItem service) {
        this.service = service;
    }
}
