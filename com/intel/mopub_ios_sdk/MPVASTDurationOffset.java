package com.intel.mopub_ios_sdk;


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
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTDurationOffset extends MPVASTModel {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTDurationOffset(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTDurationOffset alloc();

	@Generated
	@Selector("init")
	public native MPVASTDurationOffset init();

	@Generated
	@Selector("initWithDictionary:")
	public native MPVASTDurationOffset initWithDictionary(
			NSDictionary dictionary);

	@Generated
	@Selector("modelMap")
	public static native NSDictionary modelMap();

	@Generated
	@Selector("offset")
	public native String offset();

	@Generated
	@Selector("timeIntervalForVideoWithDuration:")
	public native double timeIntervalForVideoWithDuration(double duration);

	@Generated
	@Selector("type")
	@NUInt
	public native long type();
}