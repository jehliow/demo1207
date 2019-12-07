package com.imooc;

public class telphone {
	private float cpu;
	private float gpu;
	private float screen;

	public   telphone(float tscreen,float tcpu,float tgpu){
		if(tscreen<3.5f){
			System.out.println("自动赋值为3.5");
			tscreen=3.5f;
		}
		cpu=tcpu;
		gpu=tgpu;
		
		System.out.println("iphone4的尺寸："+tscreen+"\ncpu:"+tcpu+"\ngpu:"+gpu);
	}
	public static void main(String[] args){
		telphone iphone4=new telphone(3.0f, 8, 2);
	}

}
