package com.danhdt.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long userId;
	
	@Column(length = 512)
	private String title;
	private boolean done;
	
	@Enumerated(value = EnumType.ORDINAL)
	private Priority priority;
	
	@Temporal(TemporalType.DATE)
	private Date dueDate;
	
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Todo{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", done=").append(done);
        sb.append(", priority=").append(priority);
        sb.append(", dueDate=").append(dueDate);
        sb.append('}');
        return sb.toString();
    }
}
