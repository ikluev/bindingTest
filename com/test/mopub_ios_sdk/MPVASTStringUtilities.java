package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPVASTStringUtilities extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPVASTStringUtilities(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPVASTStringUtilities alloc();

	@Generated
	@Selector("doubleFromString:")
	public static native double doubleFromString(String string);

	@Generated
	@Selector("init")
	public native MPVASTStringUtilities init();

	@Generated
	@Selector("percentageFromString:")
	@NInt
	public static native long percentageFromString(String string);

	@Generated
	@Selector("stringFromTimeInterval:")
	public static native String stringFromTimeInterval(double timeInterval);

	@Generated
	@Selector("stringRepresentsNonNegativeDuration:")
	public static native boolean stringRepresentsNonNegativeDuration(
			String string);

	@Generated
	@Selector("stringRepresentsNonNegativePercentage:")
	public static native boolean stringRepresentsNonNegativePercentage(
			String string);

	@Generated
	@Selector("timeIntervalFromString:")
	public static native double timeIntervalFromString(String string);
}