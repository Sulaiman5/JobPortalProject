package com.spring.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PaymentDAO;
import com.spring.model.Payment;

@Service
public class PaymentService {

	@Autowired
	PaymentDAO paymentDAO;
	
	public Payment paymentsave(HttpServletRequest request) {
		Payment p = new Payment();
		p.setAdver_email(request.getParameter("adver_email"));
		p.setTransactionid(request.getParameter("transactionid"));
		p.setPayment(request.getParameter("payment"));
		p.setFee(Double.valueOf(request.getParameter("fee")));
		p.setOtpnumber(request.getParameter("otpnumber"));
		return paymentDAO.save(p);
	}

}
