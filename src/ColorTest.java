import java.lang.reflect.Field;

import org.junit.Test;

import com.fitch.bd.Color;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ColorTest {

	@Test
	public void test() {
		
		Color red = new Color("Red");
		System.out.println(red.toString());
		
		try {

			Field field = Color.class.getDeclaredField("color");
			
			field.setAccessible(true);
		
			field.set(red, "BLUE");
			
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println(red.toString());
		Assert.assertEquals("Equals", "BLUE", red.getColor());
		
	}

}
