package com.yash.embedded.column;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empembedded")
public class EmployeeEmbedded 
{
	    @Id
		@GeneratedValue
		@Column(name = "empid")
	    public int empid;
		@Column(name = "empName")
		public String empName;
	    @Embedded
		 public empbankAccountAdd  add;
		
	    
	    public EmployeeEmbedded() {
			super();
		}


		public EmployeeEmbedded(int empid, String empName, empbankAccountAdd add) {
			super();
			this.empid = empid;
			this.empName = empName;
			this.add = add;
		}


		public int getEmpid() {
			return empid;
		}


		public void setEmpid(int empid) {
			this.empid = empid;
		}


		public String getEmpName() {
			return empName;
		}


		public void setEmpName(String empName) {
			this.empName = empName;
		}


		public empbankAccountAdd getAdd() {
			return add;
		}


		public void setAdd(empbankAccountAdd add) {
			this.add = add;
		}


		@Override
		public String toString() {
			return "EmployeeEmbedded [empid=" + empid + ", empName=" + empName + ", add=" + add + "]";
		}
		
		
		
		
		
		
		
		
		

}

