package com.intel.mopub_ios_sdk;


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
public class MRSetOrientationPropertiesCommand extends MRCommand {
	static {
		NatJ.register();
	}

	@Generated
	protected MRSetOrientationPropertiesCommand(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRSetOrientationPropertiesCommand alloc();

	@Generated
	@Selector("commandForString:")
	public static native MRSetOrientationPropertiesCommand commandForString(
			String string);

	@Generated
	@Selector("init")
	public native MRSetOrientationPropertiesCommand init();
}