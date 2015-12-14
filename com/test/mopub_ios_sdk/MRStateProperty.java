package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRStateProperty extends MRProperty {
	static {
		NatJ.register();
	}

	@Generated
	protected MRStateProperty(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRStateProperty alloc();

	@Generated
	@Selector("init")
	public native MRStateProperty init();

	@Generated
	@Selector("propertyWithState:")
	public static native MRStateProperty propertyWithState(@NUInt long state);

	@Generated
	@Selector("setState:")
	public native void setState(@NUInt long value);

	@Generated
	@Selector("state")
	@NUInt
	public native long state();
}