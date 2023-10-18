package edu.ssafy.project;

import org.springframework.stereotype.Component;

@Component(value = "sony")
public class Sony implements Camera {

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("소니카메라가 사진을 찍습니다");
	}

}
