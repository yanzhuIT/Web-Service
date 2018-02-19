package com.alec.ws.cxf;

import java.util.List;

import com.alec.ws.cxf.GetAllStudentsMapResponse.Return;
import com.alec.ws.cxf.GetAllStudentsMapResponse.Return.Entry;

public class TestClient {
	public static void main(String[] args) {
		DataTypeWSImplService dtis = new DataTypeWSImplService();
		DataTypeWS dt = dtis.getDataTypeWSImplPort();
		boolean success = dt.addStudent(new Student(20, "Denny", 4000.0));
		System.out.println("add student is " + success);
		//-------------
		List<Student> list = dt.getStudentsBySalary(5000);
		System.out.println(list);
		//-------------------
		Return r = dt.getAllStudentsMap();
		List<Entry> list2 = r.getEntry();
		for (Entry entry : list2) {
			int id = entry.getKey();
			Student student = entry.getValue();
			System.out.println(id + "_" + student);
		}
	}
}
 