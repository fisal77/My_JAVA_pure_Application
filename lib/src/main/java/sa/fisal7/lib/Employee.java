package sa.fisal7.lib;

import java.time.LocalTime;
import java.time.ZoneId;

public class Employee {
      private String empName;
      private int empNum;
      private String empDept;



    LocalTime time = LocalTime.now(
            ZoneId.of("default"));

              public Employee( ) {
                  this("Unknown", 55, "Unknown");
                  }

                  public Employee(String name, int num, String dept) {
                     empName = name;
                      empNum = num;
                      empDept = dept;
                  }




}
