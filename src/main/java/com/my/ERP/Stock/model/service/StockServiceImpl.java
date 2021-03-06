package com.my.ERP.Stock.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ERP.Operation.model.vo.Client;
import com.my.ERP.Stock.model.dao.StockDAO;
import com.my.ERP.Stock.model.vo.Product;
import com.my.ERP.Stock.model.vo.Supply;
import com.my.ERP.common.vo.PageInfo;

@Service("sService")
public class StockServiceImpl implements StockService {

	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Autowired
	StockDAO sDAO;
	
	// 제품 목록
	@Override
	public ArrayList<Product> productList() {
		return sDAO.productList(sqlSession);
	}
	// 단일 제품 정보
	@Override
	public Product showProduct(String pcode) {
		return sDAO.showProduct(sqlSession, pcode);
	}
	// 제품 삭제
	@Override
	public int deleteProduct(String pcode) {
		return sDAO.deleteProduct(sqlSession, pcode);
	}
	// 제품 등록
	@Override
	public int addProduct(Product product) {
		return sDAO.addProduct(sqlSession, product);
	}
	// 검색창 제품 목록
	@Override
	public ArrayList<Product> addProductList() {
		return sDAO.addProductList(sqlSession);
	}
	// 제품 수정
	@Override
	public int modifyProduct(HashMap<String, Object> hs) {
		return sDAO.modifyProduct(sqlSession, hs);
	}
	// 거래처 존재 확인
	@Override
	public Client showClient(String ccode) {
		return sDAO.showClient(sqlSession, ccode);
	}
	// 검색창 거래처 목록
	@Override
	public ArrayList<Client> addClientList() {
		return sDAO.addClientList(sqlSession);
	}
	// 제품 검색
	@Override
	public ArrayList<Product> searchProduct(HashMap<String, String> hs) {
		return sDAO.searchProduct(sqlSession, hs);
	}
	// 거래처 목록
	@Override
	public ArrayList<Client> clientList() {
		return sDAO.clientList(sqlSession);
	}
	// 비품 재고 관리
	@Override
	public ArrayList<Supply> supplyManager(PageInfo pi) {
		return sDAO.supplyManager(sqlSession, pi);
	}
	// 비품 재고 관리 전체 행 개수
	@Override
	public int supplyManagerCount() {
		return sDAO.supplyManagerCount(sqlSession);
	}
	// 비품 재고 검색 행 개수
	@Override
	public int searchSupplyCount(HashMap<String, Object> hs) {
		return sDAO.searchSupplyCount(sqlSession, hs);
	}
	// 비품 재고 검색
	@Override
	public ArrayList<Supply> searchSupply(HashMap<String, Object> hs, PageInfo pi) {
		return sDAO.searchSupply(sqlSession, hs, pi);
	}
	// 제품 목록 수
	@Override
	public int productListCount() {
		return sDAO.productListCount(sqlSession);
	}
	@Override
	public ArrayList<Product> productList(PageInfo pi) {
		return sDAO.productList(sqlSession, pi);
	}
	@Override
	public Supply showSupply(String scode) {
		return sDAO.showSupply(sqlSession, scode);
	}
	@Override
	public int addSupply(Supply supply) {
		return sDAO.addSupply(sqlSession, supply);
	}
	@Override
	public int modifySupply(Supply supply) {
		return sDAO.modifySupply(sqlSession, supply);
	}
	@Override
	public int deleteSupply(String del_scode) {
		return sDAO.deleteSupply(sqlSession, del_scode);
	}
	@Override
	public int modifySupplyCount(Supply supply) {
		return sDAO.modifySupplyCount(sqlSession, supply);
	}
	@Override
	public int searchProductListCount(HashMap<String, Object> hs) {
		return sDAO.searchProductListCount(sqlSession, hs);
	}
	@Override
	public ArrayList<Product> searchProductManagerList(HashMap<String, Object> hs, PageInfo pi) {
		return sDAO.searchProductManagerList(sqlSession, hs, pi);
	}
	@Override
	public int modifyProductCount(Product product) {
		return sDAO.modifyProductCount(sqlSession, product);
	}
	@Override
	public int applicationListCount() {
		return sDAO.applicationListCount(sqlSession);
	}
	@Override
	public List<HashMap<String, String>> applicationList(PageInfo pi) {
		return sDAO.applicationList(sqlSession, pi);
	}
	@Override
	public int refuseApplication(String[] ano) {
		return sDAO.refuseApplication(sqlSession, ano);
	}
	@Override
	public int approvalApplication(String[] ano) {
		// 재고테이블이 수정되는 로직도 추가해야함
		return sDAO.approvalApplication(sqlSession, ano);
	}
	@Override
	public int searchApplicationCount(HashMap<String, Object> hs) {
		return sDAO.searchApplicationCount(sqlSession, hs);
	}
	@Override
	public List<HashMap<String, String>> searchApplicationList(PageInfo pi, HashMap<String, Object> hs) {
		return sDAO.searchApplicationList(sqlSession, pi, hs);
	}
	@Override
	public int stockInOutCount() {
		return sDAO.stockInOutCount(sqlSession);
	}
	@Override
	public List<HashMap<String, String>> stockInOutList(PageInfo pi) {
		return sDAO.stockInOutList(sqlSession, pi);
	}
	@Override
	public int searchStockInOutCount(HashMap<String, String> hs) {
		return sDAO.searchStockInOutCount(sqlSession, hs);
	}
	@Override
	public List<HashMap<String, String>> searchStockInOutList(HashMap<String, String> hs, PageInfo pi) {
		return sDAO.searchStockInOutList(sqlSession, hs, pi);
	}
	
}
