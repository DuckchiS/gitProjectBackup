package com.peisia.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.peisia.spring.dto.KWeatherDto;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/weather/*")
@AllArgsConstructor
public class WeatherController {
	@RequestMapping("/w")											
	public String w(Model model) {											
		//// 우리나라 공공 api ////										
		//인코딩 인증키										
		String API_KEY = "0ZRbAEfDUSfc0WWrIkfMeJC2n4k0mnSsmWGTI%2BsRzusFSbNNFwRvhK%2B10q9GzXbrm44XVIlXNeKTiTlEvAnPiw%3D%3D";										
		String API_URL = "http://apis.data.go.kr/1360000/AsosDalyInfoService/getWthrDataList?numOfRows=10&pageNo=1&dateCd=DAY&startDt=20240304&endDt=20240304&stnIds=108&dataCd=ASOS&dataType=JSON&serviceKey=" + API_KEY;										
				// * 주의 * https 아님 http 임. https 는 인증관련 복잡한 처리를 해야함.								
		RestTemplate restTemplate = new RestTemplate();										
												
		//// **** 중요 **** uri										
		URI uri = null; //java.net.URI 임포트 하셈										
		try {										
			uri = new URI(API_URL);									
		} catch (URISyntaxException e) {										
			e.printStackTrace();									
		}										
												
		
		KWeatherDto kw = restTemplate.getForObject(uri, KWeatherDto.class); // 자기 클래스로 바꾸시오..

		log.info("==== json ==== : 우리나라 날씨 잘 나오냐? : "+kw.response.body.dataType);									
		log.info("==== json ==== : 우리나라 날씨 잘 나오냐? : "+kw.response.body.dataType);									
		
		String location = kw.response.body.items.item.get(0).stnNm;									
		String tMin = kw.response.body.items.item.get(0).minTa;									
		String tMax = kw.response.body.items.item.get(0).maxTa;									
		String ddara = String.format("==== json ==== : 어제의 날씨입니다~ 어제 %s 의 최저기온은 %s 도 최고 기온은 %s 였습니다. 날씨였습니다.", location, tMin, tMax);									
		log.info(ddara);		
		return "/weather/w";
		
//		String s = restTemplate.getForObject(uri, String.class); 
//		log.info("====== 우리나라 날씨 잘 나오나? "+s);										
	}											
												
}
