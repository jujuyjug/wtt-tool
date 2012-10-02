package com.bitblend.wtt.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author zklibur
 */
public class ServiceItem implements Serializable {

    private String id;
    private Type type;
    private String number;
    private String description;
    private Date create;
    private Date close;
    private Type status;
    private String requestBy;
    private Type priority;

    public ServiceItem() {
    }

    public ServiceItem(String id, Type type, String number, String description, Date create, Date close, Type status, String requestBy, Type priority) {
        this.id = id;
        this.type = type;
        this.number = number;
        this.description = description;
        this.create = create;
        this.close = close;
        this.status = status;
        this.requestBy = requestBy;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ServiceItem{type=" + type + ", number=" + number + ", description=" + description + ", requestBy=" + requestBy + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.number != null ? this.number.hashCode() : 0);
        hash = 79 * hash + (this.create != null ? this.create.hashCode() : 0);
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
        final ServiceItem other = (ServiceItem) obj;
        if ((this.number == null) ? (other.number != null) : !this.number.equals(other.number)) {
            return false;
        }
        if (this.create != other.create && (this.create == null || !this.create.equals(other.create))) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public Date getClose() {
        return close;
    }

    public void setClose(Date close) {
        this.close = close;
    }

    public Type getStatus() {
        return status;
    }

    public void setStatus(Type status) {
        this.status = status;
    }

    public String getRequestBy() {
        return requestBy;
    }

    public void setRequestBy(String requestBy) {
        this.requestBy = requestBy;
    }

    public Type getPriority() {
        return priority;
    }

    public void setPriority(Type priority) {
        this.priority = priority;
    }
}
