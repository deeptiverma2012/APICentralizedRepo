package org.testing.runner;

import java.io.IOException;

import org.testing.testcase.TC10_DeleteRequest;
import org.testing.testcase.TC1_PostRequest;
import org.testing.testcase.TC2_GetAllRequest;
import org.testing.testcase.TC3_GetRequest;
import org.testing.testcase.TC4_PutRequest;
import org.testing.testcase.TC5_DeleteRequest;
import org.testing.testcase.TC6_PostRequest;
import org.testing.testcase.TC7_GetAllRequest;
import org.testing.testcase.TC8_GetRequest;
import org.testing.testcase.TC9_UpdateRequest;

public class trigger {
public static void main(String[] args) throws IOException {
	TC1_PostRequest tc1 = new TC1_PostRequest();
	tc1.Testcase1();
	
	TC2_GetAllRequest tc2 = new TC2_GetAllRequest();
	tc2.Testcase2();
	
	TC3_GetRequest tc3 = new TC3_GetRequest();
	tc3.Testcase3();
	
	TC4_PutRequest tc4 = new TC4_PutRequest();
	tc4.Testcase4();
	
	TC5_DeleteRequest tc5 = new TC5_DeleteRequest();
	tc5.Testcase5();
	
	TC6_PostRequest tc6 = new TC6_PostRequest();
	tc6.Testcase6();
	
	TC7_GetAllRequest tc7 = new TC7_GetAllRequest();
	tc7.Testcase7();
	
	TC8_GetRequest tc8 = new TC8_GetRequest();
	tc8.Testcase8();
	
	TC9_UpdateRequest tc9 = new TC9_UpdateRequest();
	tc9.Testcase9();
	
	TC10_DeleteRequest tc10 = new TC10_DeleteRequest();
	tc10.Testcase10();
}
}
