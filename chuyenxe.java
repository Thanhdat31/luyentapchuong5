package ontapbai1;

import java.util.Scanner;
import java.util.ArrayList;

public class chuyenxe {
     public char maso;
     public String hovaten;
     public int soxe;
     public double doanhthu;
     
     public chuyenxe(char maso,String hovaten,int soxe,double doanhthu) {
    	 super();
     }
     public char getmaso() {
    	return maso;  
     }
     public void setmaso(char maso) {
    	 this.maso = maso;
     }
     public String gethovaten() {
    	 return hovaten;
     }
     public void sethovaten(String hovaten) {
    	this.hovaten = hovaten; 
     }
     public int getsoxe() {
    	 return soxe;
     }
     public void setsoxe(int soxe) {
     this.soxe = soxe;
     }
     public double getdoanhthu() {
    	 return doanhthu;
     }
     public void setdoanhthu(double doanhthu) {
    	 this.doanhthu = doanhthu;
     }
     @Override
     public String toString() {
    	 return"chuyenxe[maso="+maso+",hovaten="+hovaten+",soxe="+soxe+",doanhthu="+doanhthu+"]";
     }
}
   class chuyenxenoithanh extends chuyenxe {
	  public int sotuyen;
	  public double sokm;
	  public chuyenxenoithanh(char maso, String hovaten, int soxe,double doanhthu,int sotuyen,double sokm) {
	     super(maso,hovaten,soxe,doanhthu);
	  }
	   public int getsotuyen(){
		  return sotuyen;
	  }
	  public void setsotuyen(int sotuyen) {
		  this.sotuyen=sotuyen;
	  }
	  public double getsokm() {
		  return sokm;
	  }
	  public void setsokm(double sokm) {
		  this.sokm=sokm;
	  }
	  @Override
	  public String toString() {
		  return super.toString()+"chuyenxenoithanh[sotuyen="+sotuyen+",sokm="+sokm+"]";
		  
	  }
  }
    class chuyenxengoaithanh extends chuyenxe{
	  
	  public String noiden;
	  public int songaydiduoc;
	  public chuyenxengoaithanh(char maso, String hovaten, int soxe,double doanhthu,
			  String noiden,int songaydiduoc) {
		  super(maso, hovaten,soxe, doanhthu);
	  }
	  public String getnoiden() {
		  return noiden;
		  
	  }
	 void setnoiden(String noiden) {
		  this.noiden = noiden;
	  }
	  public double getsongaydiduoc() {
		  return songaydiduoc;  
	  }
	  public void setsongaydiduoc(int songaydiduoc) {
	  this.songaydiduoc= songaydiduoc;
	  }
	  @Override
	  public String toString() {
		  return super.toString()+"chuyenxengoaithanh[noiden="+noiden+",songaydiduoc="+songaydiduoc+"]";
		  
	  }
  }
    class quanlychuyenxe{
    	ArrayList<chuyenxe>Listchuyenxe;
    	Scanner sc;
    	chuyenxe cx;
    	int chon;
    	public quanlychuyenxe() {
    		super();
    		Listchuyenxe = new ArrayList<chuyenxe>();
    		sc=new Scanner(System.in);
    		
    	}
    	public void nhap(int n)
    	{
    		for(int i=0;i<n;i++)
    		{
    			System.out.println("1: chuyen xe noi thanh");
    			System.out.println("2: chuyen xe ngoai thanh");
    			System.out.println("3: thoat");
    			chon = sc.nextInt();sc.nextLine();
    			
    			}
    }
    }
    
    