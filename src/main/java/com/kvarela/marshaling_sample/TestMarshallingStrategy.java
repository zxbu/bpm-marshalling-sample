package com.kvarela.marshaling_sample;
 
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.kie.api.marshalling.ObjectMarshallingStrategy;


import com.kvarela.marshaling_sample.MyObject;

public class TestMarshallingStrategy implements	ObjectMarshallingStrategy {

	@Override
	public boolean accept(Object object) {
		System.out.println("TestMarshallingStrategy.accept() for " + object);
		if (object instanceof MyObject)
			return true;
		else
			return false;
	}

	@Override
	public Context createContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] marshal(Context context, ObjectOutputStream os, Object object)
			throws IOException {
		System.out.println("TestMarshallingStrategy.marshal() of " + object);
		return new byte[0];
	}

	@Override
	public Object read(ObjectInputStream os) throws IOException,
			ClassNotFoundException {
		System.out.println("TestMarshallingStrategy.read()");
		return null;
	}

	@Override
	public Object unmarshal(Context context, ObjectInputStream is,
			byte[] object, ClassLoader classloader) throws IOException,
			ClassNotFoundException {
		System.out.println("TestMarshallingStrategy.unmarshal() of "
				+ is.readObject());
		return new MyObject();
	}

	@Override
	public void write(ObjectOutputStream os, Object object) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("TestMarshallingStrategy.write()");
	}

	public TestMarshallingStrategy() {
	}

}