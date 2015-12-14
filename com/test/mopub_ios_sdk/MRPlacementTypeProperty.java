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
public class MRPlacementTypeProperty extends MRProperty {
	static {
		NatJ.register();
	}

	@Generated
	protected MRPlacementTypeProperty(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRPlacementTypeProperty alloc();

	@Generated
	@Selector("init")
	public native MRPlacementTypeProperty init();

	@Generated
	@Selector("placementType")
	@NUInt
	public native long placementType();

	@Generated
	@Selector("propertyWithType:")
	public static native MRPlacementTypeProperty propertyWithType(
			@NUInt long type);

	@Generated
	@Selector("setPlacementType:")
	public native void setPlacementType(@NUInt long value);
}