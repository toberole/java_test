package com.xxx.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy {
	public interface IHello {
		void sysHello();
	}

	static class IHelloImpl implements IHello {
		@Override
		public void sysHello() {
			System.out.println("IHelloImpl#sysHello");
		}
	}

	static class XXXDynamicProxy implements InvocationHandler {
		private Object targetObject;

		public <T> T bind(Object targetObject) {
			this.targetObject = targetObject;

			Object proxy = java.lang.reflect.Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
					targetObject.getClass().getInterfaces(), this);

			return (T) proxy;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("before XXXDynamicProxy#invoke");

			Object res = method.invoke(targetObject, args);

			System.out.println("after XXXDynamicProxy#invoke");

			return res;
		}
	}

	public static void main(String[] args) {
		// 保存动态产生的代理类的字节码
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

		IHelloImpl targetObject = new IHelloImpl();
		IHello iHello = new XXXDynamicProxy().bind(targetObject);

		iHello.sysHello();
	}
}

