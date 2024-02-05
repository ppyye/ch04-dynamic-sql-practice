package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {
    public void printAllProductList(List<ProductDTO> allProductList) {
        allProductList.forEach(System.out::println);
    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {
        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        System.out.println("===== 검색 조건 : " + searchCondition.getOption() + " =====");

        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        productList.forEach(System.out::println);
    }

    public void printSuccessMessage(String successCode) {
        String success = "";
        switch(successCode) {
            case "insert" :
                success = "신규 제품 등록에 성공했습니다."; break;
            case "update" :
                success = "제품이 성공적으로 수정되었습니다."; break;
            case "delete" :
                success = "제품이 성공적으로 삭제되었습니다."; break;
        }

        System.out.println(success);
    }

    public void printErrorMessage(String errorCode) {
        String error = "";
        switch(errorCode) {
            case "selectAll" :
                error = "조회 결과가 없습니다."; break;
            case "selectProduct" :
                error = "지정한 조건의 조회 결과가 존재하지 않습니다."; break;
            case "insert" :
                error = "신규 제품 등록에 실패했습니다."; break;
            case "update" :
                error = "제품 수정에 실패했습니다."; break;
            case "delete" :
                error = "제품 삭제에 실패했습니다."; break;
        }

        System.out.println(error);
    }

}
