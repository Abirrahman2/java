package exception;
import CLASSES.*;
import Interfaces.*;
import FrameIntro.*;
import java.lang.*;
public class Myexception extends Exception{
public String getMsg(){
	return "The password is less than 8 character";
}

}