package org.redwine.rewine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "WINE")
public class Wine extends PanacheEntityBase implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    @Id
    private String wineId;

    @Column
    private String name;

    @Column
    private String origin;

    public String getWineId() {
        return wineId;
    }

    public void setWineId(String wineId) {
        this.wineId = wineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Wine [wineId='" + wineId 
                    + '\'' + ", name=" + name
                    + '\'' + ", origin=" + origin 
                    + ']';
    }
}

