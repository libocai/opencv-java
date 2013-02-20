/* Description and License
 * A Java library that wraps the functionality of the native image 
 * processing library OpenCV
 *
 * (c) Sigurdur Orn Adalgeirsson (siggi@alum.mit.edu)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 */
 
package sj.opencv.jna.cxcore;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
/**
 * <i>native declaration : modules/core/include/opencv2/core/types_c.h:1543</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CvRect extends Structure {
	public int x;
	public int y;
	public int width;
	public int height;
	public CvRect() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"x", "y", "width", "height"});
	}
	public CvRect(int x, int y, int width, int height) {
		super();
		initFieldOrder();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public CvRect(Pointer p){
		super(p);
	}
	public static class ByReference extends CvRect implements Structure.ByReference {

		public ByReference() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ByReference(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

	};
	public static class ByValue extends CvRect implements Structure.ByValue {

		public ByValue() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ByValue(Pointer p) {
			super(p);
			// TODO Auto-generated constructor stub
		}

		public ByValue(int x, int y, int width, int heigth){
			super(x,y,width,heigth);
		}
	};
}
