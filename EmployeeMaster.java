package myJavaProject;
import java.util.Scanner;

public class EmployeeMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
        String strOption = "Exit";      
        Employee[] empList = new Employee[10];
        
        //load all the employees. 
        LoadEmpSet(empList);
        
        String strEmpID = null;
        
	    do {
	    	System.out.println();
	    	System.out.printf("enter option");
	    	strOption = myInput.nextLine();
	    	//System.out.println("Your input : "+strOption);
	    	
	    	if(strOption.equalsIgnoreCase("ListAll")) {
	    		printAllEmp(empList);
	    	}

	    	if(strOption.equalsIgnoreCase("ListEmployee")) {
	    		System.out.print("enter id to find:");
	    		strEmpID = myInput.nextLine();
	    		printEmpByID(empList, strEmpID);
	    	}
	    	
	    	if(strOption.equalsIgnoreCase("AddEmployee")) {
	    		System.out.println("Adding Employee");
	    		addEmp(empList, myInput);
	    		System.out.println();
	    		printAllEmp(empList);
	    	}
	    	
	    	if(strOption.equalsIgnoreCase("RemoveEmployee")) {
	    		System.out.println("Removing Employee");
	    		System.out.print("enter id to remove:");
	    		strEmpID = myInput.nextLine();
	    		removeEmp(empList, strEmpID);
	    		System.out.println();
	    		System.out.println("employee removed : "+strEmpID);
	    		printAllEmp(empList);
	    	}
	    	
	    	if(strOption.equalsIgnoreCase("ChangeEmployee")) {
	    		System.out.print("enter id to change :");
	    		strEmpID = myInput.nextLine();
	    		removeEmp(empList, strEmpID);
	    		addEmp(empList, myInput);
	    		System.out.println("Emp id "+strEmpID+" is changed");
	    		printEmpByID(empList, strEmpID);
	    		System.out.println();
	    		System.out.println("Listing all after change");
	    		printAllEmp(empList);
	    	}
	    	
	    	
	    } while (!strOption.equalsIgnoreCase("Exit")); 
	    

	}
	
	public static void printAllEmp(Employee[] empList) {
		Dependent depTemp[] = null;	
		//System.out.println(empList.length);
		
		/*
		 * Iterate thru all the employees
		 */
		if(empList != null) {
			for (int i=0;i<empList.length;i++) { 
				if(empList[i] != null) {
					System.out.print("Emp Id:"+empList[i].strEmpId+", Emp name:"+empList[i].strEmpName+" ,Emp Address:"+empList[i].strEmpAddress);
				    depTemp = empList[i].dependents;
				    if(depTemp != null) {
				    	for(int j=0;j<depTemp.length;++j) {
				    		if(depTemp[j] != null)
				    		      System.out.print("::Dependent no:"+(j+1)+", Dependents Type:"+depTemp[j].strType +", dependent name:"+depTemp[j].strDepName);
				    	} //end of dependent for
				    	System.out.println("\n");
				    	
				    }// end of dep if
				}// end of employee List if
			}// end of employee list for
		}//end of emp object null check if 
	}

	
	public static void refreshEmp(Employee[] empList) {
		/*
		 * Iterate thru all the employees
		 */
		int j = 0;
		Employee[] empNewList = new Employee[10];
		if(empList != null) {
			for (int i=0;i<empList.length;i++) { 
				if(empList[i] != null) {
					empNewList[j] = empList[i];
					++j;
				}// end of employee List if
			}// end of employee list for
			empList = null;
			empList = empNewList;
			empNewList = null;		
		}//end of emp object null check if 
	}

	
	

	public static void printEmpByID(Employee[] empList, String strEmpID) {
		Dependent depTemp[] = null;	
		//System.out.println(empList.length);
		
		/*
		 * Iterate thru all the employees. if employee not present print employee not present. 
		 */
		boolean bEmpPresent = false;
		if(empList != null) {
			for (int i=0;i<empList.length;i++) { 
				if(empList[i] != null && empList[i].strEmpId.equalsIgnoreCase(strEmpID)) {
					bEmpPresent = true;
					System.out.print("Emp Id:"+empList[i].strEmpId+", Emp name:"+empList[i].strEmpName+" ,Emp Address:"+empList[i].strEmpAddress);
				    depTemp = empList[i].dependents;
				    if(depTemp != null) {
				    	for(int j=0;j<depTemp.length;++j) {
				    		if(depTemp[j] != null)
				    		      System.out.print("::Dependent no:"+(j+1)+", Dependents Type:"+depTemp[j].strType +", dependent name:"+depTemp[j].strDepName);
				    	} //end of dependent for
				    }// end of dep if
				}// end of employee List if
			}// end of employee list for
			
			//if no employee present then print employee not present
			if(!bEmpPresent) {
				System.out.println(" there is no employee with id : "+strEmpID);
			}
			
		}//end of emp object null check if 
	}

	public static void LoadEmpSet(Employee[] empList) {

        // Initialize sampleEmployee
        empList[0] = new Employee();
        empList[0].strEmpId = "ID1";
        empList[0].strEmpName = "Sunita";
        empList[0].strEmpAddress = "USA";
        
        //add dependents
        empList[0].dependents = null;
        Dependent tempDepList[] = new Dependent[2];
        
        //1st  dependent
        tempDepList[0] = new Dependent();
        tempDepList[0].strDepName = "Kido";
        tempDepList[0].strType = "Child";
        
        //2nd dependent        
        tempDepList[1] = new Dependent();
        tempDepList[1].strDepName = "Hubby";
        tempDepList[1].strType = "Husband";

        //add all dependents to employee
        empList[0].dependents = tempDepList;

        // Initialize sampleEmployee
        empList[1] = new Employee();
        empList[1].strEmpId = "ID2";
        empList[1].strEmpName = "Sam";
        empList[1].strEmpAddress = "USA";
        
        //add dependents
        empList[1].dependents = null;
        tempDepList = null;
        tempDepList = new Dependent[2];
        
        //1st  dependent
        tempDepList[0] = new Dependent();
        tempDepList[0].strDepName = "Lily";
        tempDepList[0].strType = "Child";
        
        //2nd dependent        
        tempDepList[1] = new Dependent();
        tempDepList[1].strDepName = "Laura";
        tempDepList[1].strType = "Wife";

        //add all dependents to employee
        empList[1].dependents = tempDepList;
        
	}
	
	
	
	public static void removeEmp(Employee[] empList, String strEmpID) {
		/*
		 * Iterate thru all the employees. if employee not present print employee not present. 
		 */
		boolean bEmpPresent = false;
		System.out.println("Enter employee ID");
		if(empList != null) {
			for (int i=0;i<empList.length;i++) { 
				if(empList[i] != null && empList[i].strEmpId.equalsIgnoreCase(strEmpID)) {
					bEmpPresent = true;
					empList[i]=null;
					refreshEmp(empList);
					break;
				}// end of employee List if
			}// end of employee list for
			//if no employee present then print employee not present
			if(!bEmpPresent) {
				System.out.println(" there is no employee with id : "+strEmpID);
			}
			
		}//end of emp object null check if 
	}
	
	/*
	 * adding employee, 
	 * Will take inputs for both employee and dependents
	 * Will reject if the emp id is already present
	 * Will reject if the size is more than total allowed
	 * 
	 */
	public static void addEmp(Employee[] empList, Scanner myInput) {
		int iEmpIndexToAdd = getEmpCount(empList);
		String strTempEmpID = null;
		//request for emp id 
		System.out.print("Enter emp id : ");
		strTempEmpID = myInput.nextLine();
		
		if(empExists(empList, strTempEmpID)){
			System.out.println("Cannot add employee as employee id already present");
			
		}else {
			System.out.println("Enter Employee name : ");
	        // Initialize sampleEmployee
	        empList[iEmpIndexToAdd] = new Employee();
	        empList[iEmpIndexToAdd].strEmpId = strTempEmpID;
	        System.out.println();
	        System.out.print("Enter emp name : ");
	        empList[iEmpIndexToAdd].strEmpName = myInput.nextLine();
	        System.out.println();
	        System.out.print("Enter emp address : ");
	        empList[iEmpIndexToAdd].strEmpAddress = myInput.nextLine();

	        System.out.println();
	        int noOfDependents = 0;

	        System.out.print("How many Dependents to add , enter only int from 1 to 5 : ");
	        
	        
	        
	        try {
	        	noOfDependents = Integer.parseInt(myInput.nextLine());
	        }catch(Exception e) {
	        	System.out.println("enter only integers, add employee will exit");
	        }
	       
	        //loop on number of dependents and add all of them
	        if(noOfDependents>5) {
	        	System.out.println("cannot have more than 5 dependents");
	        }else {
	            //add dependents
	            //empList[iEmpIndexToAdd].dependents = null;
	            Dependent tempDepList[] = new Dependent[noOfDependents];
	            
	            for(int i=0;i<tempDepList.length;i++) {
	            	System.out.println("Enter dependent no "+(i+1));
		            tempDepList[i] = new Dependent();
		            System.out.print("Enter dependent name : ");
		            tempDepList[i].strDepName = myInput.nextLine();
		            System.out.print("Enter dependent type : ");
		            tempDepList[i].strType = myInput.nextLine();
	            }
	            System.out.println("Added "+noOfDependents+" of dependents to "+empList[iEmpIndexToAdd].strEmpName);
	            empList[iEmpIndexToAdd].dependents = tempDepList;
	            
	        }
			
		}
			
		
	}
	
	/*
	 * check employee exists or not
	 * 
	 */
	public static boolean empExists(Employee[] empList, String strEmpID) {
		boolean bEmpPresent = false;
		if(empList != null) {
			for (int i=0;i<empList.length;i++) { 
				if(empList[i] != null && empList[i].strEmpId.equalsIgnoreCase(strEmpID)) {
					bEmpPresent = true;
					break;
				}	
			}	
		}
		return bEmpPresent;
	}
	
	/*
	 * check employee exists or not
	 * 
	 */
	public static int getEmpCount(Employee[] empList) {
		int intEmpCnt= 0;
		if(empList != null) {
			for (int i=0;i<empList.length;i++) { 
				if(empList[i] != null) {
					++intEmpCnt;
				}	
			}	
		}
		return intEmpCnt;
	}
}
class Employee{
	String strEmpId = "";
	String strEmpName = "";
    String strEmpAddress = "";
    Dependent dependents[] = null;
}

class Dependent {
	String strDepName = "";
	String strType = "";
}
