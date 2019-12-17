import com.aweiler.exceptions.FooRuntimeException;

public class MyFileUtils {
	public int subtract10FromLargerNumber(int number) throws Exception{
		if(number < 10) {
//			throw new Exception("Number is too small.");  // Return warning if too small.
			throw new FooRuntimeException("Number is too small.");  // Return warning if too small.
		}			  
		return number - 10;
	}
	
//	public class FooRuntimeException extends Exception {
//		public FooRuntimeException(String message) {
//			super(message);
//		}
//	}
	
}