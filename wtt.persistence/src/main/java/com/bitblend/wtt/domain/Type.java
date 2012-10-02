package com.bitblend.wtt.domain;

import java.io.Serializable;

/**
 *
 * @author zklibur
 */
class Type implements Serializable {

    private String id;
    private String name;
    private String category;
    private Type parent;

    public Type() {
    }

    public Type(String id, String name, String category, Type parent) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.parent = parent;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 71 * hash + (this.category != null ? this.category.hashCode() : 0);
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
        final Type other = (Type) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.category == null) ? (other.category != null) : !this.category.equals(other.category)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Type{" + "id=" + id + ", name=" + name + ", category=" + category + ", parent=" + parent + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Type getParent() {
        return parent;
    }

    public void setParent(Type parent) {
        this.parent = parent;
    }
}
