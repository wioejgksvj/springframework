package com.mycompany.springframework.dto;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Ch04LoginFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		log.info("실행");
		boolean result = Ch04LoginForm.class.isAssignableFrom(clazz); // supports(Class<?> clazz)가 Ch04LoginForm.class.isAssignableFrom(clazz)가 맞는가 / 검사코드
		return result; // 해당 dto가 들어오면 true 아니면 false
	}

	@Override
	public void validate(Object target, Errors errors) { // 위 코드가 true일 경우에만 validate가 실행한다.
		log.info("실행");
		Ch04LoginForm loginForm = (Ch04LoginForm) target;
		
		//mid 검사
		String mid = loginForm.getMid();
		if(mid == null || mid.equals("")) {
			errors.rejectValue("mid", "errors.mid.required");
			
		} else if(mid.length() < 6 || mid.length() > 12) {
			errors.rejectValue("mid", "errors.mid.length", new Object[] {"6", "12"}, "알수없는 에러 발생"); // rejectValue: 3번째걸로 사용 > {} 안에 값을 지정할 수 있다.
		}
		
		//mpassword 검사
		String mpassword = loginForm.getMpassword();
	      String pattern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15}";
	      if(mpassword == null || mpassword.equals("")) {
	         errors.rejectValue("mpassword", "errors.mpassword.required");
	      } else if(mpassword.length() < 8 || mpassword.length() > 15) {
	         errors.rejectValue("mpassword", "errors.mpassword.length", new Object[] {"8", "15"}, null);
	      } else if(!Pattern.matches(pattern, mpassword)) {
	         errors.rejectValue("mpassword", "errors.mpassword.wrongchar");
	      }
	}
}
