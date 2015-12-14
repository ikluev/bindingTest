package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRViewableProperty extends MRProperty {
	static {
		NatJ.register();
	}

	@Generated
	protected MRViewableProperty(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRViewableProperty alloc();

	@Generated
	@Selector("init")
	public native MRViewableProperty init();

	@Generated
	@Selector("isViewable")
	public native boolean isViewable();

	@Generated
	@Selector("propertyWithViewable:")
	public static native MRViewableProperty propertyWithViewable(
			boolean viewable);

	@Generated
	@Selector("setIsViewable:")
	public native void setIsViewable(boolean value);
}