package com.collection;

import java.util.Objects;

public class HasSet2 {
	   
	   int id;

	public HasSet2(int id) {
		
		this.id = id;
		
	}

	@Override
	public String toString() {
		return  " "+id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof HasSet2) {
			HasSet2 e=(HasSet2)o;
			if(this.id==e.id)
				return true;
			else 
				return false;
			
		}
		return false;
	}
	
	
	   

}
