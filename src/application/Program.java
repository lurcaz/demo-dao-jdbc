package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1 : Seller FindById ====");		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("==== TEST 2 : Seller findByDepartment ====");		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}System.out.println();
		
		System.out.println("==== TEST 3 : Seller findAll ====");		
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}System.out.println();	
		
		/*System.out.println("==== TEST 4 : Seller Insert ====");		
		Seller Newseller = new Seller(null, "Alessandra", "Alessandra@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(Newseller);
		System.out.println("Insert new ID = " + Newseller.getId());	
		System.out.println();*/
		
		/*System.out.println("==== TEST 5 : Seller Update ====");		
		seller = sellerDao.findById(9);
		seller.setName("Alessandra Johuson");
		sellerDao.update(seller);
		System.out.println("Updade Completed");
		System.out.println();*/
		
		System.out.println("==== TEST 6 : Seller delete ====");		
		sellerDao.deleteById(4);
		System.out.println("delete Completed");
	}
}
