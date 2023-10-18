package edu.ssafy.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "apple")
public class ApplePhone implements Phone {

	@Autowired
	@Qualifier(value = "cannon")
	private Camera camera;
	
	public ApplePhone() {}
	
	public ApplePhone(Camera camera) {
		this.camera = camera;
	}
	
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("아이폰이 전화를 합니다");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("아이폰이 전원를 켭니다");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("아이폰이 전원를 끕니다");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		camera.takePicture();
	}

}
