package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.coregraphics.struct.CGSize;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRScreenSizeProperty extends MRProperty {
	static {
		NatJ.register();
	}

	@Generated
	protected MRScreenSizeProperty(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRScreenSizeProperty alloc();

	@Generated
	@Selector("init")
	public native MRScreenSizeProperty init();

	@Generated
	@Selector("propertyWithSize:")
	public static native MRScreenSizeProperty propertyWithSize(
			@ByValue CGSize size);

	@Generated
	@Selector("screenSize")
	@ByValue
	public native CGSize screenSize();

	@Generated
	@Selector("setScreenSize:")
	public native void setScreenSize(@ByValue CGSize value);
}