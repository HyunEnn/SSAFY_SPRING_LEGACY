package edu.ssafy.project;

import org.springframework.stereotype.Component;

@Component
public class Cannon implements Camera {

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("캐논이 사진을 찍습니다");
	}

}
