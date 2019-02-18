package com.xxx.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public class Test01 {
	private Object lock;
	
	public int calc() {
		synchronized (lock) {
			System.out.println("hello world");
		}
		int a = 100;
		int b = 200;
		int c = 300;
		
		// Thread th = new Thread(null);
		
		return (a+b)*c;
	}
	
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(0);
		atomicInteger.getAndIncrement();
		
		ThreadLocal<Integer> in = new ThreadLocal<>();
		in.set(0);
		in.get();
	}
	
	static class P extends AbstractProcessor{

		@Override
		public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
			try {
				File file = new File("c:\\test11.txt");
				FileOutputStream fout = new FileOutputStream(file);
				fout.write("hello".getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
	}
	
}
