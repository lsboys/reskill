package reskill;
import java.util.*;
public class Emp {
   private String e_id;
   private String e_name;
   public Emp(String e_id,String e_name) {
	   this.e_id=e_id;
	   this.e_name=e_name;
   }
   public void setEid(String e_id) {
	   this.e_id=e_id;
   }
   public String getEid() {
	   return this.e_id;
   }
   public void setEname(String e_name) {
	   this.e_name=e_name;
	   
   }
   public String getEname() {
	   return this.e_name;
   }
   
}
