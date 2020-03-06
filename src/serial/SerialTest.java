package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class SerialTest {
	
	//Serialize a carData to a file
	public void streamOut(CarData cardata, String filename)
	{
		try {
			FileOutputStream fos=new FileOutputStream(filename);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(cardata);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public CarData streamIn(String filename) 
	{
		CarData cardata=null;
		
		try {
			FileInputStream fis=new FileInputStream(filename);
			ObjectInputStream ois=new ObjectInputStream(fis);
			cardata=(CarData)ois.readObject();
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cardata;
	}
	
	public static void main(String[] args)
	{
		SerialTest serTest=new SerialTest();
		
		CarData carData=new CarData(1,1.0,2.0,"Chevy"); 
		
		serTest.streamOut(carData, "chevy.data");
		
		CarData carData2=serTest.streamIn("chevy.data");
		System.out.println("CarData2 is:"+ carData2.getName());
		
		ArrayList<CarData> carList=new ArrayList<CarData>(); //A list for holding car data
		
		carList.add(new CarData(0,1.0,2.0,"Chevy"));
		carList.add(new CarData(1,1.0,2.0,"BMW"));
		carList.add(new CarData(2,1.0,2.0,"Land Rover"));
		carList.add(new CarData(3,1.0,2.0,"Audi"));
		carList.add(new CarData(4,1.0,2.0,"Mercedes"));
		carList.add(new CarData(5,1.0,2.0,"Ford"));
		//carList.add(new CarData(6,1.0,2.0,"Chevy"));
		
		Collections.sort(carList);   //Use Collections package to start a list
	}

}
