package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Advertiser;
import com.spring.model.Payment;
import com.spring.service.AdvertiserService;
import com.spring.service.PaymentService;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@Autowired
	AdvertiserService advertiserService;
	
	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	   public ModelAndView payment() {
		List<Advertiser> advertiser = advertiserService.getAll();
		return new ModelAndView("/advertisers/payment","advertiser", advertiser );
	   }

		@RequestMapping(value = "/paymentsave", method = RequestMethod.POST)
		public ModelAndView paymentsave(HttpServletRequest request) {
			Payment p =	paymentService.paymentsave(request);
			return new ModelAndView("/advertisers/welcome");
		}
	
		@RequestMapping(value = "/paymentsave1", method = RequestMethod.POST)
		public ModelAndView paymentsave1(HttpServletRequest request, ModelMap map) {
			String otp = request.getParameter("otpnumber");
			System.out.println(otp);
			if(otp.equals("1234")) {
				Payment p =	paymentService.paymentsave(request);
				return new ModelAndView("/advertisers/welcome");
			}else {
				map.addAttribute("err", "OTP doesn't match!!");
				return new ModelAndView("/advertisers/welcome");
			}
			
		}
}
