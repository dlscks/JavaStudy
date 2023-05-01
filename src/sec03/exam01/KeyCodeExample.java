package sec03.exam01;

public class KeyCodeExample {
//입력된 키코드를 변수에 저장 
// console에 알파벳 입력시 (a)
// keycode 값 나옴.
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

	}

}
