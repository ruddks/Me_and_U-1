package com.Me_and_U.project.service;

import java.util.ArrayList;

import com.Me_and_U.project.model.FaqVO;
import com.Me_and_U.project.model.QnaVO;

public interface IFaqService {
	public ArrayList<FaqVO> listAllFaq(); 	
	public FaqVO detailViewFaq(int faqNo);  
}