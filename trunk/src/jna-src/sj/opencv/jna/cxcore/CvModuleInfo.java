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
 * <i>native declaration : modules/core/include/opencv2/core/types_c.h:1950</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CvModuleInfo extends Structure {
	/// C type : CvModuleInfo*
	public CvModuleInfo.ByReference next;
	/// C type : const char*
	public Pointer name;
	/// C type : const char*
	public Pointer version;
	/// C type : CvPluginFuncInfo*
	public sj.opencv.jna.cxcore.CvPluginFuncInfo.ByReference func_tab;
	public CvModuleInfo() {
		super();
		initFieldOrder();
	}
	protected void initFieldOrder() {
		setFieldOrder(new String[]{"next", "name", "version", "func_tab"});
	}
	/**
	 * @param next C type : CvModuleInfo*<br>
	 * @param name C type : const char*<br>
	 * @param version C type : const char*<br>
	 * @param func_tab C type : CvPluginFuncInfo*
	 */
	public CvModuleInfo(CvModuleInfo.ByReference next, Pointer name, Pointer version, sj.opencv.jna.cxcore.CvPluginFuncInfo.ByReference func_tab) {
		super();
		this.next = next;
		this.name = name;
		this.version = version;
		this.func_tab = func_tab;
		initFieldOrder();
	}
	public static class ByReference extends CvModuleInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends CvModuleInfo implements Structure.ByValue {
		
	};
}
