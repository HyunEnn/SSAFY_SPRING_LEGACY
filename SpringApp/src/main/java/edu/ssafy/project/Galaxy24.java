package edu.ssafy.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "samsung")
public class Galaxy24 implements Phone {

	private Camera camera;
	
	public Galaxy24() {}
	
	@Autowired
	public Galaxy24(@Qualifier(value = "sony")Camera camera) {
		this.camera = camera;
	}
	
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰이 전화를 합니다");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰이 전원을 켭니다");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰이 전원을 끕니다");
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		camera.takePicture();
	}

}
