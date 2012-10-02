package com.bitblend.wtt.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author zklibur
 */
public class WorkItem implements Serializable {

    private String id;
    private Date milestone;
    private Type status;
    private String description;

    @Override
    public String toString() {
        return "WorkItem{" + "milestone=" + milestone + ", status=" + status + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.milestone != null ? this.milestone.hashCode() : 0);
        hash = 31 * hash + (this.status != null ? this.status.hashCode() : 0);
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
        final WorkItem other = (WorkItem) obj;
        if (this.milestone != other.milestone && (this.milestone == null || !this.milestone.equals(other.milestone))) {
            return false;
        }
        if (this.status != other.status && (this.status == null || !this.status.equals(other.status))) {
            return false;
        }
        return true;
    }

    public WorkItem() {
    }

    public WorkItem(String id, Date milestone, Type status, String description) {
        this.id = id;
        this.milestone = milestone;
        this.status = status;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getMilestone() {
        return milestone;
    }

    public void setMilestone(Date milestone) {
        this.milestone = milestone;
    }

    public Type getStatus() {
        return status;
    }

    public void setStatus(Type status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
